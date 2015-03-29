package com.DTO;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonProperty;

import com.fasterxml.jackson.annotation.JsonRootName;

@XmlRootElement(name= "place")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonRootName("place")
public class CropSearchDTO {

	/**
	 * @param place
	 * @param area
	 * @param year
	 * @param crop
	 */
	public CropSearchDTO(String place, String area, String year, String crop) {
		this.place = place;
		this.area = area;
		this.year = year;
		this.crop = crop;
	}
	public CropSearchDTO() {
		// TODO Auto-generated constructor stub
	}
	@XmlElement(name="place", nillable=false)
	@JsonProperty("place")
	private	String place 	 ;
	@XmlElement(name="area", nillable=false)
	@JsonProperty("area")
	private String area; 	 
	@XmlElement(name="year", nillable=false)
	@JsonProperty("year")
	private String	year; 	
	@XmlElement(name="Crop", nillable=false)
	@JsonProperty("Crop")
	private  String crop;
	/**
	 * @return the place
	 */
	public String getPlace() {
		return place;
	}
	/**
	 * @param place the place to set
	 */
	public void setPlace(String place) {
		this.place = place;
	}
	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}
	/**
	 * @param area the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}
	/**
	 * @return the year
	 */
	public String getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}
	/**
	 * @return the crop
	 */
	public String getCrop() {
		return crop;
	}
	/**
	 * @param crop the crop to set
	 */
	public void setCrop(String crop) {
		this.crop = crop;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CropSearchDTO [place=");
		builder.append(place);
		builder.append(", area=");
		builder.append(area);
		builder.append(", year=");
		builder.append(year);
		builder.append(", crop=");
		builder.append(crop);
		builder.append("]");
		return builder.toString();
	}
}
