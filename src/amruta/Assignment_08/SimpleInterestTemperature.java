/*  Assignment - 8 : 19th April'2022

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

package amruta.Assignment_08;

class SimpleInterestTemperature {
	double simpleInterest;
	float celsius;
	
	void computeSimpleInterest(int principle, int time , double rate){
		simpleInterest = (principle*time*rate)/100;
		System.out.println("Simple Interest is : "+simpleInterest);
	}
	
	void convertTempToCelcius(float fahrenheit){
		celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Temprature in Celsius is : "+celsius);
	}
	
	public static void main(String[] arg){
		SimpleInterestTemperature st = new SimpleInterestTemperature();
		st.computeSimpleInterest(5000,5,3.81);
		st.convertTempToCelcius(80);
	}
}