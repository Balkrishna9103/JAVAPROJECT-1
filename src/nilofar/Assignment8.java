package nilofar;
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

public class Assignment8 {
	void calSimpleInterest(int P, int T, float R) {
		float Interest = (P * T * R) / 100;
		System.out.println("Simple Interest in " + Interest + " Rs.");
		System.out.println();
	}

	void convertFahrenheitToCelsius(float fahrenheit) {
		double Celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Temperature in Celsius is " + Celsius + "C");
		System.out.println();
	}

	public static void main(String[] args) {
		Assignment8 assignment8 = new Assignment8();
		assignment8.calSimpleInterest(25000, 3, 6.75f);
		assignment8.convertFahrenheitToCelsius(70);
	}

}
