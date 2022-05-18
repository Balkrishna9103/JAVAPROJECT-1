/*Assignment - 8 : 19th April'2022

Create two parameterized methods in same class. 
1.Write a method to compute simple interest   
	Simple Interest = (P x T x R)/100 
	Where, 
		P is the principle amount 
		T is the time [year] and 
		R is the rate

2.Write a method to convert temperature from Fahrenheit to Celsius degree.
	 Celsius = (fahrenheit - 32) * 5 / 9
	 */

package trupti;

public class TruptiAssignment8 {
	void findSimpleIntrest(int p, float t, float r) {
		float simpleIntrest;
		simpleIntrest=(p*t*r)/100;
		System.out.println("Simple Intrest = "+simpleIntrest);
	}
	
	void convertTemperature(float fahrenheit) {
		float celsius;
		celsius = (fahrenheit - 32) * 5/ 9;
		System.out.println(fahrenheit+" degree Fahrenheit: "+celsius+" degree Celsius");
	}
	
	public static void main(String[] args) {
		TruptiAssignment8 truptiAssignment8= new TruptiAssignment8();
		truptiAssignment8.findSimpleIntrest(13000,4.2f,12.50f);
		truptiAssignment8.convertTemperature(35.45f);
	}
}
