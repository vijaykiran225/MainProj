package com.hibernate;

public class ConfidenceFactorPOJO {

	
	/**
	 * 
	 */
	public ConfidenceFactorPOJO() {
		
		// TODO Auto-generated constructor stub
	}
	private 	int id ; 			
	private 	String varietyname ;
	private	double season 	 ;
	private double days; 	 
	private double	avgyield; 	
	private  double 	 feat 	;
	private  double 	places;
	
	/**
	 * @param varietyname
	 * @param season
	 * @param days
	 * @param avgyield
	 * @param feat
	 * @param places
	 */
	public ConfidenceFactorPOJO(String varietyname, double season, double days,
			double avgyield, double feat, double places) {
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ConfidenceFactorPOJO [id=");
		builder.append(id);
		builder.append(", ");
		if (varietyname != null) {
			builder.append("varietyname=");
			builder.append(varietyname);
			builder.append(", ");
		}
		builder.append("season=");
		builder.append(season);
		builder.append(", days=");
		builder.append(days);
		builder.append(", avgyield=");
		builder.append(avgyield);
		builder.append(", feat=");
		builder.append(feat);
		builder.append(", places=");
		builder.append(places);
		builder.append("]");
		return builder.toString();
	}
}
