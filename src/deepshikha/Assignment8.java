package deepshikha;

public class Assignment8 {
	void simpleInterest(double p, float r, int t) {
		double SI=p*r*t/100;
		System.out. println("simple interest of numbers is: "+ SI);
	}
	
	void convertTemp(double farenheit) {
		double celsius=(farenheit-32)*5/9;
		System.out.println("The value of celcius is: "+ celsius);
	}
public static void main(String[] args) {
	Assignment8 assignment8=new Assignment8();
	assignment8.simpleInterest(123.4, 10.2f, 7);
	assignment8.convertTemp(341.7);
}

	

}
