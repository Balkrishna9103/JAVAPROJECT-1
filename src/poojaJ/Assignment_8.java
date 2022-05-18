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

Raise PR for the same
*/
package poojaJ;

public class Assignment_8 {
	void simpleInterest(int principle, int time, double rate) {
		double simpleInt=0;
		simpleInt= (principle * time *rate)/100;
		System.out.println(simpleInt);
	}
	
	void fahrenheitToCelcius(float fahrenheit) {
		float celcius= 0;
		celcius=(fahrenheit-32)*5/9;
		System.out.println(celcius);

	}
	
	public static void main(String[] args) {
		Assignment_8 assignment_8 = new Assignment_8(); 
		assignment_8.simpleInterest(100000,24,5.8);
		assignment_8.fahrenheitToCelcius(200);
		}
	}

