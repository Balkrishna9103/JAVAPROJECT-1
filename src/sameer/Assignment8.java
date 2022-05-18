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
 * 
 */
package sameer;

public class Assignment8
{

	public static void main(String[] args)
	{
		Assignment8 assignment8 = new Assignment8();
		assignment8.computeSimpleInterest(18550, 1.6, 7.25);
		
		assignment8.convertFahrenheitToCelsius(85);	
	}
	 
	//Method to calculate simple interest
	void computeSimpleInterest(int p, double t, double r)
	{
		double simpleInterest = 0;
		simpleInterest = (p*t*r)/100;
		System.out.println("Simple interest is "+simpleInterest);
	}
	
	//Method to convert Fahrenheit to Celsius degree
	void convertFahrenheitToCelsius(float fahrenheit)
	{
		float celsius =(fahrenheit - 32) * 5 / 9 ;
		System.out.println("Celsius is "+celsius);
	}
}
