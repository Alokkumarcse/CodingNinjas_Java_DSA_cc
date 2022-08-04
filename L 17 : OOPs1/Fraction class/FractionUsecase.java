package com.fractionClass;

public class FractionUsecase {

	public static void main(String[] args) {
		Fraction f1 = new Fraction(4,5);
		f1.print();
		
		Fraction f2 = new Fraction(3,2);
		f2.print();
//		
//		f1.setNumerator(23);
//		f1.setDenominator(1);
//		f1.print();
	
//		f1.incrementFraction(3);
//		f1.print();
		
//		f1.addFraction(f2);
//		f1.print();
		
		// add(f1, f2) is static method so, we call it via Fraction class not by its instance
		Fraction f3 = Fraction.add(f1, f2);
		f3.print();
		

	}

}
