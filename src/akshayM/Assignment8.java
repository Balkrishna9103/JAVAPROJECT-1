/*Assignment - 8 : 19th April'2022

Create two parameterized methods in same class. 

Write a method to compute simple interest   
	Simple Interest = (P x T x R)/100 
	Where, 
		P is the principle amount 
		T is the time [year] and 
		R is the rate

 Write a method to convert temperature from Fahrenheit to Celsius degree.
	 Celsius = (fahrenheit - 32) * 5 / 9  */

package akshayM;

public class Assignment8 {

	void calculateSimpleInterest(int principleAmt, float numOfYears, float rate)
	{
		float simpleInterest = 0.0f;
		simpleInterest = (float) (principleAmt * numOfYears * rate)/100;
		System.out.println("Simple Interest is " + simpleInterest);
	}
	
	void convertTemprature(float fahrenheit)
	{
		float celsius = 0.0f;
		celsius = (fahrenheit - 32)* 5 / 9;
		System.out.println("Temprature in celcius is "+celsius);
	}
	
	public static void main(String[] args) {
		Assignment8 assignment8 = new Assignment8();
		assignment8.calculateSimpleInterest(11223, 5, 6.7f);
		assignment8.convertTemprature(97.0f);
	}
}