package bhushan;

public class Assignment8 {
	double simpleintrest;
	double temp;
	void disp1(double principle,float time,float rateofint) {
		simpleintrest=((principle*time*rateofint)/100);
		System.out.println("Sum of Intrest is "+simpleintrest);
	}
	
	void disp2(int fahrenheit) {
		double val1=0;
		val1=((fahrenheit-32)*5);
		temp=val1/9;
		System.out.println("temp Celsius degree "+temp);
	}
public static void main(String[] args) {
	Assignment8 assignment8=new Assignment8();
	assignment8.disp1(10000.0, 1.0f, 9.0f);
	assignment8.disp2(88);
}
}
