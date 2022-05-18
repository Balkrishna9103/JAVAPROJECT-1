package pragati;

public class Assign8SimpleInterest{
	double simpleInterest=0.0;
	void simpleInterest(int P, float T, double R){
		simpleInterest=(P*T*R)/100;
		System.out.println("simple interest= "+simpleInterest);
	}
	void conversion(float fahrenheit){
		float celsius=0.0f;
		celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Celsius = "+celsius);
		 
	}
	
	public static void main(String[] args){
		Assign8SimpleInterest assign8simpleInterest = new Assign8SimpleInterest();
		assign8simpleInterest.simpleInterest(3500000,20,7.2);
		assign8simpleInterest.conversion(55);
	}
}
