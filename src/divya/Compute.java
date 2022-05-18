package divya;

public class Compute {
	
	
	void simpleInterest(double principal, int time, double rate) {
		
		double simpleinterest = (principal * time * rate)/100;
		System.out.println("Simple Interest " + simpleinterest);	
	}
	
	void farenheitToCelcius( double farenheit) {
		
		double celcius = (farenheit-32)*5/9;
		System.out.println(farenheit + " Farenheit to " + celcius);	
	}
	public static void main(String[] args) {
		
		Compute compute = new Compute();
		compute.simpleInterest(43.00, 4, 22);
		compute.farenheitToCelcius(350.0);
	}
}
