package minalS;

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

public class Assignment8SI {
	
	void simpleInterest(int ammount,int year,int rate) {
		int sI=(ammount*year*rate)/100;
		System.out.println("Simple interest is : "+sI+" rs");
	}
	
	void fahrenheitToCelcius(int fahrenheit) {
		int celcius=(fahrenheit-32)*5/9;
		System.out.println("Temprature in celcius is : "+celcius+"C");
	}
	
	public static void main(String[] args) {
		Assignment8SI assignment8SI=new Assignment8SI();
		assignment8SI.simpleInterest(13000, 2, 8);
		assignment8SI.fahrenheitToCelcius(80);
	}
}
