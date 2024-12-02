package com.polymorphisme;

public class MathUtil {
	public int calculer(int a,int b) {
		return a+b;
	}
	
	public double calculer(double a,double b) {
		return a+b;
	}
	
	public int calculer(int a,int b, boolean multiplier) {
		if (multiplier) {
		return a*b;
		}
		return calculer(a,b);
	}

}
