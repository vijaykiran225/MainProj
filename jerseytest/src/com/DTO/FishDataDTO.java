package com.DTO;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonProperty;
//import org.codehaus.jackson.annotate.JsonTypeName;
//import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@XmlRootElement(name= "Response")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonRootName("response")
public class FishDataDTO {
	/**
	 * @param fishing
	 * @param weather
	 * @param temperature
	 * @param humidity
	 * @param windy
	 */
	public FishDataDTO(String fishing, String weather, String temperature,
			String humidity, String windy) {
		this.fishing = fishing;
		this.weather = weather;
		this.temperature = temperature;
		this.humidity = humidity;
		this.windy = windy;
	}
	public FishDataDTO() {
		// TODO Auto-generated constructor stub
	}
	 @XmlElement(name="fishing" , nillable=false)
	 @JsonProperty("fishing")
	private String fishing ;
	 @XmlElement(name="weather" , nillable=false)
	 @JsonProperty("weather")
	private String weather ;
	 @XmlElement(name="temperature" , nillable=false)
	 @JsonProperty("temperature")
	private String temperature ;
	 @XmlElement(name="humidity" , nillable=false)
	 @JsonProperty("humidity")
	private String humidity;
	 @XmlElement(name="windy" , nillable=false)
	 @JsonProperty("windy")
	private String windy;
	/**
	 * @return the fishing
	 */
	public String getFishing() {
		return fishing;
	}
	/**
	 * @return the weather
	 */
	public String getWeather() {
		return weather;
	}
	/**
	 * @return the temperature
	 */
	public String getTemperature() {
		return temperature;
	}
	/**
	 * @return the humidity
	 */
	public String getHumidity() {
		return humidity;
	}
	/**
	 * @return the windy
	 */
	public String getWindy() {
		return windy;
	}
	/**
	 * @param fishing the fishing to set
	 */
	public void setFishing(String fishing) {
		this.fishing = fishing;
	}
	/**
	 * @param weather the weather to set
	 */
	public void setWeather(String weather) {
		this.weather = weather;
	}
	/**
	 * @param temperature the temperature to set
	 */
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	/**
	 * @param humidity the humidity to set
	 */
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
	/**
	 * @param windy the windy to set
	 */
	public void setWindy(String windy) {
		this.windy = windy;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FishData [fishing=");
		builder.append(fishing);
		builder.append(", weather=");
		builder.append(weather);
		builder.append(", temperature=");
		builder.append(temperature);
		builder.append(", humidity=");
		builder.append(humidity);
		builder.append(", windy=");
		builder.append(windy);
		builder.append("]");
		return builder.toString();
	}
}
