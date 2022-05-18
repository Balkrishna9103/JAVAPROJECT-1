package dipali;

public class Celsius {
	void simpleInterest(double principleAmount, double timeInyear, double interestRate) {
		double simInt = (principleAmount*timeInyear*interestRate)/100;
		System.out.println("Principle Ammount= "+principleAmount+", Tenure= "+timeInyear+" years,"+" Interest Rate= "+interestRate+"%, Simple Intereset= "+simInt+".");
	}
	
	void convertTemperature(double tempInFahrenheit) {
		double inCelsius = (tempInFahrenheit - 32)*5/9;
		System.out.println("Temperature in Fahrenheit: "+tempInFahrenheit+", Temperature converted in Celsius: "+inCelsius+".");	
	}
	
	public static void main(String[] args) {
		Celsius celsi = new Celsius();
		celsi.simpleInterest(157000.53, 8.5, 6.45);
		celsi.convertTemperature(170.75);
	}

}
