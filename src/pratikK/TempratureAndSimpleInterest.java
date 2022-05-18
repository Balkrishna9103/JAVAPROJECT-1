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

Raise PR for the same
 */
package pratikK;

public class TempratureAndSimpleInterest {
	float si;
	float celsius;
	void simpleInterest(int principal,float time,float rate) {
		System.out.println(si=principal*time*rate/100);		
	}
	void temprature(float fahrenheit){
		System.out.println((celsius=fahrenheit-32)*5/9);
	}
	public static void main(String[] args) {
		TempratureAndSimpleInterest tempratureandsimpleInterest=new TempratureAndSimpleInterest();
		tempratureandsimpleInterest.simpleInterest(100,6.5f,7.5f);
		tempratureandsimpleInterest.temprature(62.5f);
	}
}
