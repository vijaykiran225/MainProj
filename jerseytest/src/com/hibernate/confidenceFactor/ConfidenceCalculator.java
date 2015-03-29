/**
 * 
 */
package com.hibernate.confidenceFactor;

import com.DTO.ConfidenceFactorDTO;
import com.DTO.ResponseDTO;
import com.hibernate.HibernateConnector;

/**
 * @author Vijay Kiran
 * 
 */
public class ConfidenceCalculator {

	private static final String TEST_TARGET = "mdu5,rice";

	/**
	 * $query2=
	 * "select sum(season),sum(places),sum(feat),sum(avgyield),sum(days) from cf"
	 * ; $ph_e=$r['season']/$r1['sum(season)'];
	 * 
	 * @param dto
	 * @param dto0
	 */
	private ResponseDTO calculateConfidenceFactor(ConfidenceFactorDTO factorDTO,
			ResponseDTO responseDTO) {
		// TODO Auto-generated method stub
		Double rowTotal = responseDTO.getAvgyield() + responseDTO.getDays()
				+ responseDTO.getFeat() + responseDTO.getSeason()
				+ responseDTO.getPlaces();
		System.out.println(rowTotal + "is the row total");
		Double ph_e_Season = responseDTO.getSeason()
				/ factorDTO.getTotalSeason();
		Double ph_e_Days = responseDTO.getDays() / factorDTO.getTotalDays();
		Double ph_e_Avgyield = responseDTO.getAvgyield()
				/ factorDTO.getTotalAvgyield();
		Double ph_e_Feat = responseDTO.getFeat() / factorDTO.getTotalFeat();
		Double ph_e_Places = responseDTO.getPlaces()
				/ factorDTO.getTotalPlaces();

		double cf = cfCalcNative(rowTotal, ph_e_Season);
		System.out.println(cf + " is the confidence value");
		responseDTO.setCertaintyValueSeason(cf);
		
		 cf = cfCalcNative(rowTotal, ph_e_Days);
		System.out.println(cf + " is the confidence value");
		responseDTO.setCertaintyValueDays(cf);

		 cf = cfCalcNative(rowTotal, ph_e_Avgyield);
		System.out.println(cf + " is the confidence value");
		responseDTO.setCertaintyValueAvgyield(cf);
		
		 cf = cfCalcNative(rowTotal, ph_e_Feat);
		System.out.println(cf + " is the confidence value");
		responseDTO.setCertaintyValueFeat(cf);

		 cf = cfCalcNative(rowTotal, ph_e_Places);
		System.out.println(cf + " is the confidence value");
		responseDTO.setCertaintyValuePlaces(cf);
		return responseDTO;
	}

	/**
	 * @param rowTotal
	 * @param ph_e_Season
	 * @return
	 */
	private double cfCalcNative(Double rowTotal, Double ph_e_Season) {
		double $mb = 0;
		double $md = 0;
		double $cf = 0;
		Double $max = 0D;
		Double $min = 0D;
		Double $ph = rowTotal;
		if ($ph >= 1) {
			$mb = 1;
		} else {

			if (ph_e_Season > $ph) {
				$max = ph_e_Season;
			} else {
				$max = $ph;
			}
			$mb = (($max - $ph) / (1 - $ph));
		}
		if ($ph == 0) {
			$md = 1;
		} else {

			if (ph_e_Season > $ph) {
				$min = $ph;
			} else {
				$min = ph_e_Season;
			}
			$md = (($ph - $min) / ($ph));
		}
		$cf = $mb - $md;
		$cf = $cf * 100;
		$cf=$cf/2;
		return $cf;
	}

	/**
	 * Kick starter
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfidenceFactorDTO factorDTO = new ConfidenceFactorDTO();
		ResponseDTO responseDTO = new ResponseDTO();
		HibernateConnector connector = new HibernateConnector();
		responseDTO = connector.populateValuesToDTO(responseDTO, TEST_TARGET);
		factorDTO = connector.populateValuesForConfidenceFactor(factorDTO,
				TEST_TARGET);
		ConfidenceCalculator calculator = new ConfidenceCalculator();
		calculator.calculateConfidenceFactor(factorDTO, responseDTO);
	}
	
	public  ResponseDTO calculate(String args, ResponseDTO responseDTO) {
		// TODO Auto-generated method stub
		ConfidenceFactorDTO factorDTO = new ConfidenceFactorDTO();
		
		HibernateConnector connector = new HibernateConnector();
		responseDTO = connector.populateValuesToDTO(responseDTO, args);
		factorDTO = connector.populateValuesForConfidenceFactor(factorDTO,
				args);
		ConfidenceCalculator calculator = new ConfidenceCalculator();
		return calculator.calculateConfidenceFactor(factorDTO, responseDTO);
	}

}
