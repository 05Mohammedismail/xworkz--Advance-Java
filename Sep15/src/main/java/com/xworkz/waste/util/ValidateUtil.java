package com.xworkz.waste.util;

public class ValidateUtil {
	
	public static boolean validateString(String str) {
		if(str!=null && !str.isEmpty() && str.length()>=3 && str.length()<=30){
			return true;
		}
		else {
			    }	
		return false;
	}
	
	public static boolean validateNumber(double d) {
		if(d>0) {
			return true;
		}
	else {
			}
		return false;
}
}

