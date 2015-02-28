package com.prolog.java;
import jpl.*;
public class JPLDataAccessorObject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String queryString="consult('D:/Android/ADT_Works/PrologWithJava/src/mod2.pl')";
		Query q1=new Query(queryString);
		System.out.println("status : "+q1.hasSolution());
		Query q2=new Query("assert(variety(tkm12,rice))");
		System.out.println("status : "+q2.hasSolution());
		//,
		Query q3=new Query("season(When),days(Give),avgyield(Gives),feat(With),places(Where)");
		System.out.println("status : "+q3.oneSolution().get("When"));
		System.out.println("status : "+q3.oneSolution().get("Where"));
		System.out.println("status : "+q3.oneSolution().get("With"));
		System.out.println("status : "+q3.oneSolution().get("Give"));
		System.out.println("status : "+q3.oneSolution().get("Gives"));

		
	}

}
