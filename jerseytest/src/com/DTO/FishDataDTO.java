package com.DTO;

public class FishDataDTO {
	public FishDataDTO() {
		// TODO Auto-generated constructor stub
	}
	
	private String fishing ;
	private String weather ;
	private String temperature ;
	private String humidity;
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
