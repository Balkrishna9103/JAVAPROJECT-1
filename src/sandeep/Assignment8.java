package sandeep;

public class Assignment8 {
	void simpleInterest(int principle, int time, float rate){
		float simpleinterest = ((principle*time*rate)/100);
		System.out.println("Simple Interest is: " + simpleinterest);
	}

	void convertTemperature(float fahrenheit){
		float Celsius;
		Celsius = (((fahrenheit -32) * 5) / 9);
		System.out.println("Celsius for given temperature value is: " + String.format("%.2f",Celsius) + "°C");
	}

	public static void main(String[] args){
		Assignment8 assignment8 = new Assignment8();
		assignment8.simpleInterest(50000, 5, 10.75f);
		assignment8.convertTemperature(98.5f);
	}
}
