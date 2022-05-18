package sachinP;
/*
Assignment - 8 : 19th April'2022

Create two parameterized methods in same class. 

Write a method to compute simple interest   
	Simple Interest = (P x T x R)/100 
	Where, 
		P is the principle amount 
		T is the time [year] and 
		R is the rate

 Write a method to convert temperature from Fahrenheit to Celsius degree.
	 Celsius = (fahrenheit - 32) * 5 / 9
*/

class IntandTemp{
	double Celsius;
	double interest;

	void interest(double principal,double time,double rate){		
		interest=(principal*time*rate)/100;
		System.out.println(interest);	
	}
	
	void convTempFromFtoC(double fahrenheit){
		Celsius = (fahrenheit- 32) * 5 /9;
		System.out.println(Celsius);			
	}

	public static void main(String a[]){
		IntandTemp intandtemp=new IntandTemp();
		intandtemp.interest(100000,1,10.10);
		intandtemp.convTempFromFtoC(40);
	}//main method
}//class