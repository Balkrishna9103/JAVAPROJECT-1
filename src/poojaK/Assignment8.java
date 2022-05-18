package poojaK;

public class Assignment8 {
	void simpleInterest(){
		int  p = 2500;
		int t = 2;
		int r = 2;
		int simpleInterest;
		simpleInterest = (p*t*r/100);
		System.out.println("Simple Interest is "+ simpleInterest);
	}
	
	void FahrenheitToCelsius(){
		float fahrenheit = 35 ;
		float celsius;
		celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Covert temparature from Fahrenheit to Celsius degree "+ celsius);
	} 
	public static void main(String[] args) {
		Assignment8 celsiusDegree = new Assignment8();
		celsiusDegree.simpleInterest();
		celsiusDegree.FahrenheitToCelsius();
		
	}
}
