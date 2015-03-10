package com.vijayhibernate;

import java.sql.Timestamp;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class MusicManager {

	/**
	 * @param args
	 */
	private static MusicManager musicManager=new MusicManager();
;
	public MusicManager() {
		// TODO Auto-generated constructor stub
//		musicManager=new MusicManager();
	}
	private static SessionFactory factory;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		factory = new Configuration().configure().buildSessionFactory();
		
		List<HibernatePOJO> returnedList=musicManager.getData();
		for(HibernatePOJO temp: returnedList)
		System.out.println(temp.toString());
	
		//int response = callInsert();
		//System.out.println(response +" is the resposne");
		int response = callUpdate();
		System.out.println(response +" is the resposne");
		

		 returnedList=musicManager.getData();
		for(HibernatePOJO temp: returnedList)
		System.out.println(temp.toString());
	}

	/**
	 * @return
	 */
	public static int callInsert() {
		int rating=4;
		Timestamp playdate=new Timestamp(new Date().getTime());
		String title="Kathi Theme";
		String artist="Vijay";
		String album="Kathi";
		String genre="Killer";
		String releasedate="2015";
		int duration=456;
		String author="Vijay";
		HibernatePOJO pojo=new HibernatePOJO(title, artist, album, genre, releasedate, duration, author, playdate, rating);
		int response=musicManager.insert(pojo);
		return response;
	}
	public static int callUpdate() {
		int rating=4;
		Timestamp playdate=new Timestamp(new Date().getTime());
		String title="Kathi Theme";
		String artist="Vijay";
		String album="Kathi";
		String genre="Killer";
		
		String releasedate="2015";
		int duration=456;
		String author="Vijay";
		HibernatePOJO pojo=new HibernatePOJO(title, artist, album, genre, releasedate, duration, author, playdate, rating);
		pojo.setId(7898);
		int response=musicManager.update(pojo,8);
		return response;
	}

	@SuppressWarnings("unchecked")
	private  List<HibernatePOJO> getData() {
		Session session = factory.openSession();
		Transaction transaction = null;
		List<HibernatePOJO> dataList = new LinkedList<HibernatePOJO>();
		try {
			transaction = session.beginTransaction();
			dataList = session.createQuery("from HibernatePOJO").list();
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return dataList;
	}

	private  int insert(HibernatePOJO pojo) {
		Session session =factory.openSession();
		Transaction transaction=null;
		int response = -1;
		try{
			transaction=session.beginTransaction();
			response=(Integer) session.save(pojo);
			transaction.commit();
		}catch(Exception e)
		{
			if(transaction!=null){transaction.rollback();}
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
		return response;
	}

	private  int update(HibernatePOJO oldPojo,int newPojo) {
		Session session =factory.openSession();
		Transaction transaction=null;
		int response = 0;
		try{
			transaction=session.beginTransaction();
		 session.createQuery("update HibernatePOJO set artist='bull shitter' where id='"+newPojo+"'").executeUpdate();
			transaction.commit();
		}catch(Exception e)
		{
			if(transaction!=null){transaction.rollback();}
			return -1;
		}
		finally
		{
			session.close();
		}
		return response;
	}

	private  boolean delete(HibernatePOJO pojo) {
		return false;
	}
}
