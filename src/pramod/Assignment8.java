/* Assignment - 8 : 19th April'2022

Create two parameterized methods in same class. 

Write a method to compute simple interest   
	Simple Interest = (P x T x R)/100 
	Where, 
		P is the principle amount 
		T is the time [year] and 
		R is the rate

 Write a method to convert temperature from Fahrenheit to Celsius degree.
	 Celsius = (fahrenheit - 32) * 5 / 9

Raise PR for the same */

package pramod;

public class Assignment8 {
	
	void computeIntrest(double pAmount, double time, double rate) {
		double sIntrest;
		sIntrest=(pAmount*time*rate)/100;
		System.out.println("Simple Intrest for " +pAmount+ " for the time period of "+time+ " years at the rate of " +rate+ "% is "+sIntrest);
	}
	
	void tempConverter(float fahrenheit) {
		float celsius;
		celsius=(fahrenheit - 32)*5/9;
		System.out.println(fahrenheit +"F is equal to "+celsius+"C");
	}
	
	public static void main(String[] args) {
		Assignment8 assignment8 = new Assignment8();
		assignment8.computeIntrest(10000, 2.5, 12.5);
		assignment8.tempConverter(100);
		
	}

}
