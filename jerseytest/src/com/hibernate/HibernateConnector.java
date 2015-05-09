/**
 * 
 */
package com.hibernate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.hibernate.*;
import org.hibernate.cfg.*;

import com.DTO.ConfidenceFactorDTO;
import com.DTO.ResponseDTO;



/**
 * @author Vijay Kiran
 *
 */
public class HibernateConnector {

	/**
	 * 
	 */
	public HibernateConnector() {
		super();
		factory=new Configuration().configure().buildSessionFactory();
		// TODO Auto-generated constructor stub
	}
	private static final Logger logger = Logger.getLogger(HibernateConnector.class);

	private static SessionFactory factory;
	public static void main(String[] args) {
		String log4jConfPath = "src/log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);
		HibernateConnector connector=new HibernateConnector();
		connector.fetchVarieties("greengram");
	}
	private  void init() {
		String log4jConfPath = "C:/Users/Vijay Kiran/workspace/jerseytest/src/log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);
		HibernateConnector connector=new HibernateConnector();
		//return connector.getData(content);
	}
	public ResponseDTO populateValuesToDTO(ResponseDTO dto,String content) {
		init();
		ConfidenceFactorPOJO pojo=getData(content).get(0);
		// TODO Auto-generated method stub
		dto.setAvgyield(pojo.getAvgyield());
		dto.setDays(pojo.getDays());
		dto.setFeat(pojo.getFeat());
		dto.setPlaces(pojo.getPlaces());
		dto.setSeason(pojo.getSeason());
		return dto;
	}
	
	public ConfidenceFactorDTO populateValuesForConfidenceFactor(ConfidenceFactorDTO dto,String lookFor) {
		init();
		List<Double> doubles=getAggregateData(lookFor);
		// TODO Auto-generated method stub
		dto.setTotalSeason(doubles.get(0));
		dto.setTotalPlaces(doubles.get(1));
		dto.setTotalFeat(doubles.get(2));
		dto.setTotalAvgyield(doubles.get(3));
		dto.setTotalDays(doubles.get(4));
		return dto;
	}
	
	private List<Double> getAggregateData(String lookFor) {
		Session session = factory.openSession();
		Transaction transaction = null;
		List<Double> dataReturnList = new LinkedList<Double>();
		List<Double> dataList = new LinkedList<Double>();
		try {
			transaction = session.beginTransaction();
			String string = "select sum(season),sum(places),sum(feat),sum(avgyield),sum(days) from ConfidenceFactorPOJO ";
			Query createQuery = session.createQuery(string);
			dataList = createQuery.list();
			for (Iterator iterator = dataList.iterator(); iterator.hasNext();) {
				Object[] pojo = (Object[]) iterator.next();
				for (Object object : pojo) {
					Double pojoLong = (Double)object;
					System.out.println(pojoLong.toString());	
					dataReturnList.add(pojoLong);
				}
				
				
				logger.info(pojo.toString());
			}
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null)
				transaction.rollback();
			logger.error(e.getMessage());
			e.printStackTrace();
		} finally {
			session.close();
			logger.info("success");
		}
		return dataReturnList;
	}
	
	
	@SuppressWarnings("unchecked")
	private  List<ConfidenceFactorPOJO> getData(String lookFor) {
		Session session = factory.openSession();
		Transaction transaction = null;
		List<ConfidenceFactorPOJO> dataList = new LinkedList<ConfidenceFactorPOJO>();
		try {
			transaction = session.beginTransaction();
			String string = "from ConfidenceFactorPOJO where varietyname='"+lookFor+"'";
			Query createQuery = session.createQuery(string);
			dataList = createQuery.list();
			for (Iterator iterator = dataList.iterator(); iterator.hasNext();) {
				ConfidenceFactorPOJO confidenceFactorPOJO = (ConfidenceFactorPOJO) iterator
						.next();
				System.out.println(confidenceFactorPOJO.toString());
				logger.info(confidenceFactorPOJO.toString());
			}
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null)
				transaction.rollback();
			logger.error(e.getMessage());
			e.printStackTrace();
		} finally {
			session.close();
			logger.info("success");
		}
		return dataList;
	}
	
	public List<String> fetchVarieties(String crop) {
		Session session = factory.openSession();
		Transaction transaction = null;
		List<String> dataList = new LinkedList<String>();
		List<String> responseList = new LinkedList<String>();
		try {
			transaction = session.beginTransaction();
			String string = "select varietyname from ConfidenceFactorPOJO where varietyname like '%"+crop+"'";
			Query createQuery = session.createQuery(string);
			dataList = createQuery.list();
			for (Iterator iterator = dataList.iterator(); iterator.hasNext();) {
				String confidenceFactorPOJO = (String) iterator
						.next();
				System.out.println(confidenceFactorPOJO.toString());
				logger.info(confidenceFactorPOJO.toString());
				String[] temp=confidenceFactorPOJO.split(",");
				System.out.println(temp[0]);
				responseList.add(temp[0]);
			}
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null)
				transaction.rollback();
			logger.error(e.getMessage());
			e.printStackTrace();
		} finally {
			session.close();
			logger.info("success");
		}
		return responseList ;
	}
}
