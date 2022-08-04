package com.fractionClass;

public class Fraction {
	
	private  int numerator;
	private int denominator;
	
	
	// fraction constructor
	
	public Fraction() {};// default constructor
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		simplify();
	}
	
	// fraction simplify method
	private void simplify() {
		 int hcf =  gcd(this.numerator, this.denominator);
		 this.numerator = numerator/hcf;
		 this.denominator = denominator/hcf;
	 }
	// finding gcd of two number
	private static int gcd(int numerator, int denominator) {
		if(numerator == 0) return denominator;
		if(denominator == 0) return numerator;
		
		if( numerator < denominator) {
			int temp = numerator;
			numerator = denominator;
			denominator = temp;
		}
		return gcd( denominator, numerator% denominator);
	}
	
	// setter methods
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	
	public void setDenominator(int denominator) {
		if(denominator == 0 ) {
		    this.denominator= 1;
		}else {
			this.denominator = denominator;
		}
	}
	
	// fraction increment method
	public void incrementFraction(int step) {
		this.numerator = this.numerator + (step * this.denominator);
	}
	
	// fraction addition 
	public void addFraction(Fraction f2) {
		this.numerator = this.numerator * f2.denominator + this.denominator * f2.numerator;
		this.denominator = this.denominator * f2.denominator;
		simplify();
	}
	
	// fraction addition and return result in form of new object
	public static Fraction add(Fraction f1, Fraction f2) {
		int newNumerator = f1.numerator * f2.denominator + f1.denominator * f2.numerator;
		int newDenominator = f1.denominator * f2.denominator;
		Fraction f3 = new Fraction(newNumerator, newDenominator);
		return f3;
	}
	
	// fraction print method
	public void print() {
		System.out.println(this.numerator+"/"+this.denominator);
	}
	
}
