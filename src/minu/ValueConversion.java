/*
 * Create two parameterized methods in same class. 

Write a method to compute simple interest   
	Simple Interest = (P x T x R)/100 
	Where, 
		P is the principle amount 
		T is the time [year] and 
		R is the rate

 Write a method to convert temperature from Fahrenheit to Celsius degree.
	 Celsius = (fahrenheit - 32) * 5 / 9
 */

package minu;

public class ValueConversion {
	
	void computeSimpleInterest(double principle,int time, float rate) {
		double simpleInterest =  (principle * time * rate )/100;
		System.out.println("Simple Interest is : " + simpleInterest);	
	}

	void fahrenheitToCelsiusConverter(float fahrenheit) {
		float celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Temperature in Celsius is: " + celsius);
	}
	
	public static void main(String[] args) {
		ValueConversion valueConversion = new ValueConversion();
		valueConversion.computeSimpleInterest(2000.12, 5, 6.5f);
		valueConversion.fahrenheitToCelsiusConverter(36.7f);
	}
}
