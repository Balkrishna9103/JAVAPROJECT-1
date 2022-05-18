/*
Assignment - 8 : 19th April'2022

Create two parameterized methods in same class. 

Write a method to compute simple interest   
	Simple Interest = (P x T x R)/100 
	Where, 
		P is the principle amount 
		T is the time [year] and 
		R is the rate

 Write a method to convert temperature from Fahrenheit to Celsius degree.
	 Celsius = (fahrenheit - 32) * 5 / 9

Raise PR for the same
*/

package minalH;

public class Assignment8 {

	void simpleInterest(int principleAmt, int years, double rateOfInterest) {
		System.out.println("Simple Interest is : "+(principleAmt*years*rateOfInterest)/100);
	}
	
	void fahrenheitToCelsius(float fahrenheit) {
		float celsius = (fahrenheit-32)*5/9;
		System.out.println("Temperature in Celsius is : "+celsius);
	}
	
	public static void main(String[] args) {
		Assignment8 assignment8 = new Assignment8();
		assignment8.simpleInterest(500000, 5, 8.5);
		assignment8.fahrenheitToCelsius(93);
	}
}
