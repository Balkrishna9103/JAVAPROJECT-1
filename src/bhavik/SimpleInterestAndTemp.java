package bhavik;

public class SimpleInterestAndTemp {
	void simpleInterest(int p, double t, double r) {
		double si=(p*t*r)/100;
		System.out.println("Simple Interest for amount Rs. "+ p + " for duration of " + t + " years at rate of interest " + r +" % is = "+ si);
	}
	
	void fahrenheitToCelsius(double t) {
		double c = (t - 32) * 5 / 9;
		System.out.println(t + " Fahrenheit = " + c + " celcius");
	}
	
	public static void main(String[] args) {
		SimpleInterestAndTemp simpleInterestAndTemp = new SimpleInterestAndTemp();
		simpleInterestAndTemp.simpleInterest(100, 1, 7);
		simpleInterestAndTemp.fahrenheitToCelsius(110);
	}
}
