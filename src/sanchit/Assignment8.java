/*Assignment - 8 : 19th April'2022

Create two parameterized methods in same class. 

Write a method to compute simple interest   
	Simple Interest = (P x T x R)/100 
	Where, 
		P is the principle amount 
		T is the time [year] and 
		R is the rate

 Write a method to convert temperature from Fahrenheit to Celsius degree.
	 Celsius = (fahrenheit - 32) * 5 / 9

Raise PR for the same*/

package sanchit;

public class Assignment8 {
	
	void simpleInterest(double principleAmount, double timeInyears, double interestRate) {
		double simInt = (principleAmount*timeInyears*interestRate)/100;
		System.out.println("Principle Ammount= "+principleAmount+", Tenure= "+timeInyears+" years,"+" Interest Rate= "+interestRate+"%, Simple Intereset= "+simInt+".");
	}
	
	void convertTemperature(double temperatureInFahrenheit) {
		double inCelsius = (temperatureInFahrenheit - 32)*5/9;
		System.out.println("Temperature in Fahrenheit: "+temperatureInFahrenheit+", Temperature converted in Celsius: "+inCelsius+".");	
	}
	
	public static void main(String[] args) {
		Assignment8 assignment8 = new Assignment8();
		assignment8.simpleInterest(350000.75, 3.5, 10.45);
		assignment8.convertTemperature(120.65);
	}
}
