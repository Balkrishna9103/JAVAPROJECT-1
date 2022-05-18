package rohini;

/*Create two parameterized methods in same class. 

Write a method to compute simple interest   
	Simple Interest = (P x T x R)/100 
	Where, 
		P is the principle amount 
		T is the time [year] and 
		R is the rate

 Write a method to convert temperature from Fahrenheit to Celsius degree.
	 Celsius = (fahrenheit - 32) * 5 / 9 */

public class Assingment8 {
	
	void simpleInterest(int principle, int term, double rate) {
		double simInt=0;
		simInt = (principle*term*rate)/100;
		System.out.println("Simple Interest for "+term+" year term with rate:"+ rate+" is "+simInt);
	}
	
	void fahrCel(float far) {
		float cal = 0;
		
		cal = (far-32) * 5/9;
		
		System.out.println("Temperature in celsius degree : "+ cal);
	}
	
	public static void main(String[] args) {
		
		Assingment8 ass = new Assingment8();
		
		ass.simpleInterest(100000, 12, 5.7);
		ass.fahrCel(100);
	}
	
}


