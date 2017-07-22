package com.DTO;


import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@XmlRootElement(name= "Response")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonRootName("response")
public class ResponseDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public ResponseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	 @XmlElement(name="id" , nillable=false)
	 @JsonProperty("id")
	private 	int id ; 		
	@XmlElement(name="varietyname", nillable=false)
	@JsonProperty("varietyname")
	private 	String varietyname ;
	@XmlElement(name="season", nillable=false)
	@JsonProperty("season")
	private	double season 	 ;
	@XmlElement(name="days", nillable=false)
	@JsonProperty("days")
	private double days; 	 
	@XmlElement(name="avgyield", nillable=false)
	@JsonProperty("avgyield")
	private double	avgyield; 	
	@XmlElement(name="feat", nillable=false)
	@JsonProperty("feat")
	private  double 	 feat 	;
	@XmlElement(name="places", nillable=false)
	@JsonProperty("places")
	private  double 	places;
	
	@XmlElement(name = "Error", nillable=false)
	private String error;
	
	
	
	
	
	@XmlElement(name="when", nillable=false)
	@JsonProperty("when")
	private	String when 	 ;
	@XmlElement(name="give", nillable=false)
	@JsonProperty("give")
	private String give; 	 
	@XmlElement(name="gives", nillable=false)
	@JsonProperty("gives")
	private String	gives; 	
	@XmlElement(name="with", nillable=false)
	@JsonProperty("with")
	private  String 	 with 	;
	@XmlElement(name="where", nillable=false)
	@JsonProperty("where")
	private  String 	where;
	
	
	
	@XmlElement(name="certaintyValueSeason", nillable=false)
	@JsonProperty("certaintyValueSeason")
	private	Double certaintyValueSeason 	 ;
	@XmlElement(name="certaintyValueDays", nillable=false)
	@JsonProperty("certaintyValueDays")
	private Double certaintyValueDays; 	 
	@XmlElement(name="certaintyValueAvgyield", nillable=false)
	@JsonProperty("certaintyValueAvgyield")
	private Double	certaintyValueAvgyield; 	
	@XmlElement(name="certaintyValueFeat", nillable=false)
	@JsonProperty("certaintyValueFeat")
	private  Double certaintyValueFeat 	;
	@XmlElement(name="certaintyValuePlaces", nillable=false)
	@JsonProperty("certaintyValuePlaces")
	private  Double certaintyValuePlaces;
	
	
	/**
	 * @param id
	 * @param varietyname
	 * @param season
	 * @param days
	 * @param avgyield
	 * @param feat
	 * @param places
	 */
	public ResponseDTO(int id, String varietyname, double season, double days,
			double avgyield, double feat, double places) {
		this.id = id;
		this.varietyname = varietyname;
		this.season = season;
		this.days = days;
		this.avgyield = avgyield;
		this.feat = feat;
		this.places = places;
	}
	
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the varietyname
	 */
	public String getVarietyname() {
		return varietyname;
	}
	/**
	 * @param varietyname the varietyname to set
	 */
	public void setVarietyname(String varietyname) {
		this.varietyname = varietyname;
	}
	/**
	 * @return the season
	 */
	public double getSeason() {
		return season;
	}
	/**
	 * @param season the season to set
	 */
	public void setSeason(double season) {
		this.season = season;
	}
	/**
	 * @return the days
	 */
	public double getDays() {
		return days;
	}
	/**
	 * @param days the days to set
	 */
	public void setDays(double days) {
		this.days = days;
	}
	/**
	 * @return the avgyield
	 */
	public double getAvgyield() {
		return avgyield;
	}
	/**
	 * @param avgyield the avgyield to set
	 */
	public void setAvgyield(double avgyield) {
		this.avgyield = avgyield;
	}
	/**
	 * @return the feat
	 */
	public double getFeat() {
		return feat;
	}
	/**
	 * @param feat the feat to set
	 */
	public void setFeat(double feat) {
		this.feat = feat;
	}
	/**
	 * @return the places
	 */
	public double getPlaces() {
		return places;
	}
	/**
	 * @param places the places to set
	 */
	public void setPlaces(double places) {
		this.places = places;
	}


	/**
	 * @return the error
	 */
	public String getError() {
		return error;
	}


	/**
	 * @param error the error to set
	 */
	public void setError(String error) {
		this.error = error;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ResponseDTO [id=");
		builder.append(id);
		builder.append(", varietyname=");
		builder.append(varietyname);
		builder.append(", season=");
		builder.append(season);
		builder.append(", days=");
		builder.append(days);
		builder.append(", avgyield=");
		builder.append(avgyield);
		builder.append(", feat=");
		builder.append(feat);
		builder.append(", places=");
		builder.append(places);
		builder.append(", error=");
		builder.append(error);
		builder.append(", dataseason=");
		builder.append(when);
		builder.append(", datadays=");
		builder.append(give);
		builder.append(", dataavgyield=");
		builder.append(gives);
		builder.append(", datafeat=");
		builder.append(with);
		builder.append(", dataplaces=");
		builder.append(where);
		builder.append("]");
		return builder.toString();
	}


	/**
	 * @return the when
	 */
	public String getWhen() {
		return when;
	}


	/**
	 * @param when the when to set
	 */
	public void setWhen(String when) {
		this.when = when;
	}


	/**
	 * @return the give
	 */
	public String getGive() {
		return give;
	}


	/**
	 * @param give the give to set
	 */
	public void setGive(String give) {
		this.give = give;
	}


	/**
	 * @return the gives
	 */
	public String getGives() {
		return gives;
	}


	/**
	 * @param gives the gives to set
	 */
	public void setGives(String gives) {
		this.gives = gives;
	}


	/**
	 * @return the with
	 */
	public String getWith() {
		return with;
	}


	/**
	 * @param with the with to set
	 */
	public void setWith(String with) {
		this.with = with;
	}


	/**
	 * @return the where
	 */
	public String getWhere() {
		return where;
	}


	/**
	 * @param where the where to set
	 */
	public void setWhere(String where) {
		this.where = where;
	}


	/**
	 * @return the certaintyValueSeason
	 */
	public Double getCertaintyValueSeason() {
		return certaintyValueSeason;
	}


	/**
	 * @param certaintyValueSeason the certaintyValueSeason to set
	 */
	public void setCertaintyValueSeason(Double certaintyValueSeason) {
		this.certaintyValueSeason = certaintyValueSeason;
	}


	/**
	 * @return the certaintyValueDays
	 */
	public Double getCertaintyValueDays() {
		return certaintyValueDays;
	}


	/**
	 * @param certaintyValueDays the certaintyValueDays to set
	 */
	public void setCertaintyValueDays(Double certaintyValueDays) {
		this.certaintyValueDays = certaintyValueDays;
	}


	/**
	 * @return the certaintyValueAvgyield
	 */
	public Double getCertaintyValueAvgyield() {
		return certaintyValueAvgyield;
	}


	/**
	 * @param certaintyValueAvgyield the certaintyValueAvgyield to set
	 */
	public void setCertaintyValueAvgyield(Double certaintyValueAvgyield) {
		this.certaintyValueAvgyield = certaintyValueAvgyield;
	}


	/**
	 * @return the certaintyValueFeat
	 */
	public Double getCertaintyValueFeat() {
		return certaintyValueFeat;
	}


	/**
	 * @param certaintyValueFeat the certaintyValueFeat to set
	 */
	public void setCertaintyValueFeat(Double certaintyValueFeat) {
		this.certaintyValueFeat = certaintyValueFeat;
	}


	/**
	 * @return the certaintyValuePlaces
	 */
	public Double getCertaintyValuePlaces() {
		return certaintyValuePlaces;
	}


	/**
	 * @param certaintyValuePlaces the certaintyValuePlaces to set
	 */
	public void setCertaintyValuePlaces(Double certaintyValuePlaces) {
		this.certaintyValuePlaces = certaintyValuePlaces;
	}


}
