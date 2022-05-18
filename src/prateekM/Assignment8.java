package prateekM;

public class Assignment8 {
	
	void simpleInterest(int principal, int time, float rate) {
		float interest= (principal*time*rate)/100;
		System.out.println("Simple Interest is for given Input is : "+interest);
		
	}
	
	void Temperature(float fahrenheit) {
		float celsius;
		celsius = (fahrenheit-32)*5/9;
		System.out.println("Converted value of temperature from fahrenheit to celsius is : "+celsius);
		
		
	}

	public static void main(String[] args) {
		Assignment8 assignment8 = new Assignment8();
		assignment8.simpleInterest(10000, 2, 9.6f);
		assignment8.Temperature(100);
	}
}
