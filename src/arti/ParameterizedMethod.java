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

Raise PR for the same */

package arti;

public class ParameterizedMethod {
	
	float simpleInterest;
	float celsius;
	
	void calculateSimpleInterest(int principleAmount, int time, float rateOfInterest)
	{
		simpleInterest= (principleAmount*time*rateOfInterest)/100;
		System.out.println("Simple interest on " +principleAmount+ " for " +time +" years with rate of Interest " +rateOfInterest+" is : "+simpleInterest);
	}
	
	void convertTemp(float fahrnTemp) {
		celsius= (fahrnTemp-32)*5/9;
		System.out.println(fahrnTemp + " Fahrenheit is : " + celsius+" celsius");
	}
	public static void main(String[] args) 
	{
		ParameterizedMethod paraMethod=new ParameterizedMethod();
		paraMethod.calculateSimpleInterest(200000, 5, 7.5f);
		paraMethod.convertTemp(102);
		
		
	}

}
