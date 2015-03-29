package com.prolog.constants;

public enum AvailableConstants {
	GENERIC_CROP("GENERIC_CROP"),
	GENERIC_PLACE("GENERIC_PLACE"),
	GENERIC_AREA("GENERIC_AREA"),
	GENERIC_YEAR("GENERIC_YEAR"),
	 YEAR_SEVERE ( "severe"),
	 YEAR_NORMAL ( "normal"),
	 YEAR_MODERATE ( "moderate"),
	 AREA_RAINFED ( "rainfed"),
	 AREA_WELL_IRRIGATED ( "well_irrigated"),
	 AREA_TANKFED ( "tankfed"),
	 kanchipuram ( "kanchipuram" ),
	 thiruvallur ( "thiruvallur" ),
	 villupuram ( "villupuram" ),
	 thiruvannamalai ( "thiruvannamalai" ),
	 vellore ( "vellore" ),
	 cuddalore ( "cuddalore" ),
	 dharmapuri ( "dharmapuri" ),
	 salem ( "salem" ),
	 namakkal ( "namakkal" ),
	 tiruchengodu  ( "tiruchengodu" ),
	 erode ( "erode" ),
	 coimbatore ( "coimbatore" ),
	 dindigul ( "dindigul" ),
	 theni ( "theni" ),
	 thanjavur ( "thanjavur" ),
	 thiruvarur ( "thiruvarur" ),
	 nagapattinam ( "nagapattinam" ),
	 trichirapalli ( "trichirapalli" ),
	 perambalur ( "perambalur" ),
	 pudukottai ( "pudukottai" ),
	 madurai ( "madurai" ),
	 ramanathapuram ( "ramanathapuram" ),
	 virudhunagar ( "virudhunagar" ),
	 sivagangai ( "sivagangai" ),
	 tirunelveli ( "tirunelveli" ),
	 thoothukudi ( "thoothukudi" ),
	 kanyakumari ( "kanyakumari" );
		
	 String content;
	
	
	AvailableConstants(String name)
	{
		content=name;
	
	}
	public String getValue()
	{
		return content;
		
	}
	public static boolean inEnum(String text) {
		for (AvailableConstants element : AvailableConstants.values()) {
			if(element.getValue().equals(text))
			{
				return true;
			}
		}
		return false;
	}
}
