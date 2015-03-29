package com.prolog;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonProperty;

import com.DTO.CropSearchDTO;
import com.fasterxml.jackson.annotation.JsonRootName;

@XmlRootElement(name= "response")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonRootName("response")
public class CropSerachPOJO {

	@XmlElement(name="places", nillable=false)
	@JsonProperty("places")
	private	List<CropSearchDTO> place ;

	/**
	 * @return the place
	 */
	public List<CropSearchDTO> getPlace() {
		return place;
	}

	/**
	 * @param place the place to set
	 */
	public void setPlace(List<CropSearchDTO> place) {
		this.place = place;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CropSerachPOJO [places=");
		builder.append(place);
		builder.append("]");
		return builder.toString();
	} 
}
