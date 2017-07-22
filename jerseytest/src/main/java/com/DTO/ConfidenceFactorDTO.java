package com.DTO;



public class ConfidenceFactorDTO {

	 		
	private String varietyname ;
	private	Double totalSeason 	 ;
	private Double totalDays; 	 
	private Double	totalAvgyield; 	
	private  Double totalFeat 	;
	private  Double totalPlaces;
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
	 * @return the totalSeason
	 */
	public Double getTotalSeason() {
		return totalSeason;
	}
	/**
	 * @param totalSeason the totalSeason to set
	 */
	public void setTotalSeason(Double totalSeason) {
		this.totalSeason = totalSeason;
	}
	/**
	 * @return the totalDays
	 */
	public Double getTotalDays() {
		return totalDays;
	}
	/**
	 * @param totalDays the totalDays to set
	 */
	public void setTotalDays(Double totalDays) {
		this.totalDays = totalDays;
	}
	/**
	 * @return the totalAvgyield
	 */
	public Double getTotalAvgyield() {
		return totalAvgyield;
	}
	/**
	 * @param totalAvgyield the totalAvgyield to set
	 */
	public void setTotalAvgyield(Double totalAvgyield) {
		this.totalAvgyield = totalAvgyield;
	}
	/**
	 * @return the totalFeat
	 */
	public Double getTotalFeat() {
		return totalFeat;
	}
	/**
	 * @param totalFeat the totalFeat to set
	 */
	public void setTotalFeat(Double totalFeat) {
		this.totalFeat = totalFeat;
	}
	/**
	 * @return the totalPlaces
	 */
	public Double getTotalPlaces() {
		return totalPlaces;
	}
	/**
	 * @param totalPlaces the totalPlaces to set
	 */
	public void setTotalPlaces(Double totalPlaces) {
		this.totalPlaces = totalPlaces;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ConfidenceFactorDTO [varietyname=");
		builder.append(varietyname);
		builder.append(", totalSeason=");
		builder.append(totalSeason);
		builder.append(", totalDays=");
		builder.append(totalDays);
		builder.append(", totalAvgyield=");
		builder.append(totalAvgyield);
		builder.append(", totalFeat=");
		builder.append(totalFeat);
		builder.append(", totalPlaces=");
		builder.append(totalPlaces);
		builder.append("]");
		return builder.toString();
	}
}
