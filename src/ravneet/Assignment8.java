/*
 * Assignment - 8 : 19th April'2022

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

package ravneet;

public class Assignment8 {
	double simpleInterest;
	float celsius;

	void simpleInterest(double principleAmount, double time, int rate) {
		simpleInterest = (principleAmount * time * rate) / 100;
		System.out.println("Simple Interest is " + simpleInterest);
	}

	void fahrenheitToCelsius(float farhrenheit) {
		celsius = (farhrenheit - 32) * 5 / 9;
		System.out.println("Celsius Temperature is " + celsius);
	}

	public static void main(String[] args) {
		Assignment8 assignment8 = new Assignment8();
		assignment8.simpleInterest(2000.6, 1, 10);
		assignment8.fahrenheitToCelsius(16);
	}

}
