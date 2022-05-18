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
*/

package ashish;

public class Assignment8 {
	
	public void computeSimpleInterest(double p, double t, double r) {
		double simpleInterest = (p * t * r)/100;
		System.out.println("Simple Interest will be: " + simpleInterest);
	}

	public void fahrenheitToCelsiusConverter(float fahrenheit) {
		float Celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Temperature in Celsius is: " + Celsius );		
	}
	
	public static void main(String[] args) {
		Assignment8 assignment8 = new Assignment8();
		assignment8.computeSimpleInterest(500000.50,15,10.2);
		assignment8.fahrenheitToCelsiusConverter(102.5f);
	}
}
