package prabhat;

public class PrabhatAssignment8 {
	void findSimpleIntrest(int p, float t, float r) {
		float simpleIntrest;
		simpleIntrest=(p*t*r)/100;
		System.out.println("Simple Intrest = "+simpleIntrest);
	}

	void convertTemperature(float fahrenheit) {
		float celsius;
		celsius = (fahrenheit - 32) * 5/ 9;
		System.out.println(fahrenheit+" degree Fahrenheit: "+celsius+" degree Celsius");
	}

	public static void main(String[] args) {
		PrabhatAssignment8 prabhatAssignment8= new PrabhatAssignment8();
		prabhatAssignment8.findSimpleIntrest(10000,5.0f,12.50f);
		prabhatAssignment8.convertTemperature(32.45f);
	}
}
