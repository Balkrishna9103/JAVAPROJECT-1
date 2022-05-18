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
 */

package shekhar;

public class Assignement8_parameterizedMethod {
		void simpleInterest(float p,float t,float r) {
			float simpleInterest = (p*t*r)/100;
			System.out.println("Simple interest is: " +simpleInterest);
			
		}
		
		void temperature(float fahrenheit) {
			float celcius =((fahrenheit -32)*5)/9;
			System.out.println("Temperature in celcius is: " +celcius);
			
		}
		
		public static void main(String[] args) {
			Assignement8_parameterizedMethod assignement8_parameterizedmethod=new Assignement8_parameterizedMethod();
			assignement8_parameterizedmethod.simpleInterest(5000, 1, 15);
			assignement8_parameterizedmethod.temperature(35);
		}

}
