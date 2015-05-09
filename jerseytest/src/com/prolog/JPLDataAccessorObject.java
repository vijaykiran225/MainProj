package com.prolog;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

import com.DTO.CropSearchDTO;
import com.DTO.FishDataDTO;
import com.DTO.ResponseDTO;
import com.prolog.constants.AvailableConstants;

import jpl.*;

public class JPLDataAccessorObject {

	public static void main(String[] args) {
		JPLDataAccessorObject d = new JPLDataAccessorObject();
		//d.assignMod(AvailableConstants.kanyakumari.getValue(),
			//	AvailableConstants.GENERIC_AREA.getValue(),
//				AvailableConstants.YEAR_NORMAL.getValue());
		
		d.assignFishMod("", "normal", "rain", "no", "mild");
	}

	/**
	 * @param args
	 */
	public ResponseDTO assign(String args) {
		// TODO Auto-generated method stub
		String queryString = "consult('C:/Users/Vijay Kiran/workspace/jerseytest/src/com/prolog/data/mod2.pl')";
		Query q1 = new Query(queryString);
		Query q2 = new Query("assert(variety(" + args + "))");
		Query q3 = new Query(
				"season(When),days(Give),avgyield(Gives),feat(With),places(Where)");
		return getPrologData(q1, q2, q3);

	}

	/**
	 * @param q1
	 * @param q2
	 * @param q3
	 */
	private static ResponseDTO getPrologData(Query q1, Query q2, Query q3) {
		System.out.println("status : " + q1.hasSolution());
		System.out.println("status : " + q2.hasSolution());
		// ,
		ResponseDTO dataPOJO = new ResponseDTO();
		System.out.println("status : " + q3.oneSolution().get("When"));
		dataPOJO.setWhen(q3.oneSolution().get("When").toString());
		System.out.println("status : " + q3.oneSolution().get("Where"));
		dataPOJO.setWhere(q3.oneSolution().get("Where").toString());
		System.out.println("status : " + q3.oneSolution().get("Where"));
		dataPOJO.setWhere(q3.oneSolution().get("Where").toString());
		System.out.println("status : " + q3.oneSolution().get("Give"));
		dataPOJO.setGive(q3.oneSolution().get("Give").toString());
		System.out.println("status : " + q3.oneSolution().get("Gives"));
		dataPOJO.setGives(q3.oneSolution().get("Gives").toString());
		return dataPOJO;
	}

	public List<CropSearchDTO> assignMod(String place, String area, String year) {
		// TODO Auto-generated method stub
		CropSearchDTO dto = new CropSearchDTO();
		if (AvailableConstants.inEnum(place)) {
			dto.setPlace(place);
		}
		if (AvailableConstants.inEnum(area)) {
			dto.setArea(area);
		}
		if (AvailableConstants.inEnum(year)) {
			dto.setYear(year);
		}
		String queryString = "consult('C:/Users/Vijay Kiran/workspace/jerseytest/src/com/prolog/data/data.pl')";
		Query q1 = new Query(queryString);
		Query q2 = new Query("" + "data(district(" + place + "),area(" + area
				+ "),year(" + year + ")," + AvailableConstants.GENERIC_CROP
				+ ")");
		System.out.println(q2.toString());
		return getPrologData(q1, q2, dto);

	}

	@SuppressWarnings("rawtypes")
	private List<CropSearchDTO> getPrologData(Query q1, Query q3,
			CropSearchDTO cont) {
		System.out.println("status : " + q1.hasSolution());
		System.out.println("status : " + q3.hasSolution());
		List<CropSearchDTO> dtos = new ArrayList<>();

		Hashtable[] prologResponse = q3.allSolutions();
		for (int i = 0; i < prologResponse.length; i++) {
			Hashtable hashtable = prologResponse[i];
			Enumeration keys = hashtable.keys();
			CropSearchDTO dto = cont;
			while (keys.hasMoreElements()) {
				Object object = (Object) keys.nextElement();
				System.out.println(object + "::");
				if (object.toString().equals(
						AvailableConstants.GENERIC_CROP.getValue())) {
					dto.setCrop(hashtable.get(object).toString());
					System.err.println(hashtable.get(object));
				}
				if (object.toString().equals(
						AvailableConstants.GENERIC_AREA.getValue())) {
					dto.setArea(hashtable.get(object).toString());
					System.err.println(hashtable.get(object));
				}
				if (object.toString().equals(
						AvailableConstants.GENERIC_YEAR.getValue())) {
					dto.setYear(hashtable.get(object).toString());
					System.err.println(hashtable.get(object));
				}

			}
			System.out.println(dto.toString());
			dtos.add(dto);

			System.err.println("===========================");
		}

		return dtos;

	}

	public FishDataDTO assignFishMod(String args, String humidity
			,String weather,String wind,String temperature) {
		// TODO Auto-generated method stub
		String queryString = "consult('C:/Users/Vijay Kiran/workspace/jerseytest/src/com/prolog/data/conditionFish.pl')";
		Query q1 = new Query(queryString);
		// Query q2=new Query("assert(variety("+args+"))");
		Query q3 = new Query("data(fishing(X),weather('"+weather+"'),temperature('"+temperature+"'),humidity('"+humidity+"'),windy('"+wind+"'))");
		return getPrologDataAqua(q1, q3);

	}

	/**
	 * @param q1
	 * 
	 * @param q3
	 */
	private static FishDataDTO getPrologDataAqua(Query q1, Query q3) {
		System.out.println("status : " + q1.hasSolution());
		// System.out.println("status : "+q2.hasSolution());
		// ,
		FishDataDTO dataPOJO = new FishDataDTO();
		System.out.println("status : " + q3.oneSolution().get("X"));
		dataPOJO.setFishing((q3.oneSolution().get("X").toString()));
		/*
		System.out.println("status : " + q3.oneSolution().get("windy"));
		dataPOJO.setWindy(q3.oneSolution().get("windy").toString());
		System.out.println("status : " + q3.oneSolution().get("humidity"));
		dataPOJO.setHumidity((q3.oneSolution().get("humidity").toString()));
		System.out.println("status : " + q3.oneSolution().get("temperature"));
		dataPOJO.setTemperature((q3.oneSolution().get("temperature").toString()));
		System.out.println("status : " + q3.oneSolution().get("weather"));
		dataPOJO.setWeather((q3.oneSolution().get("weather").toString()));*/
		return dataPOJO;
	}
}
