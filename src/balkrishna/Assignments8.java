/*Create two parameterized methods in same class. 

Write a method to compute simple interest   
	Simple Interest = (P x T x R)/100 
	Where, 
		P is the principle amount 
		T is the time [year] and 
		R is the rate

 Write a method to convert temperature from Fahrenheit to Celsius degree.
	 Celsius = (fahrenheit - 32) * 5 / 9*/



package balkrishna;

public class Assignments8 {
	void simpleInterest(int principle, int time, float rate){
		float simpleinterest = ((principle*time*rate)/100);
		System.out.println("Simple Interest is: " + simpleinterest);
	}

	void convertTemperature(float fahrenheit){
		float Celsius;
		Celsius = (((fahrenheit -32) * 5) / 9);
		System.out.println(" temperature value is: " + String.format("%.2f",Celsius) + "°C");
	}

	public static void main(String[] args){
		Assignments8 assignments8 = new Assignments8();
		assignments8.simpleInterest(1000, 5, 10.75f);
		assignments8.convertTemperature(67.5f);
	}
}