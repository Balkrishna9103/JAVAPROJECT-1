/*Assignment - 8 : 19th April'2022
Create two parameterized methods in same class. 
Write a method to compute simple interest   
	Simple Interest = (P x T x R)/100 
	Where, 
		P is the principle amount 
		T is the time [year] and 
		R is the rate
 Write a method to convert temperature from Fahrenheit to Celsius degree.
	 Celsius = (fahrenheit - 32) * 5 / 9
Raise PR for the same*/
package tusharB;
class Assignment8{

	void simpleInterset(double p,double t, double r){
		double simpleinterest;
		simpleinterest = (p*t*r)/100;
		System.out.println("principleamount = " + p );
		System.out.println("Tenure =" + t);
		System.out.println("ROI= " + r );
		System.out.println("Total SimpleInterets is =" + simpleinterest);
	}
	void celsiusc(double fahrenheit){
		double celsius;
		celsius = (fahrenheit-32)*5/9;
		System.out.println("fahrenheit =" + fahrenheit);
		System.out.println("Temperature in celsius =" + celsius);
		
	}
	public static void main(String[] args){
		Assignment8 assignment8=new Assignment8();
		assignment8.simpleInterset(150000.0,20,6.75);
		assignment8.celsiusc(40.5);
	}
}
