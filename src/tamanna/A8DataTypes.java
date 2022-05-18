/* Assignment - 8 : 19th April'2022

Create two parameterized methods in same class. 

Write a method to compute simple interest   
	Simple Interest = (P x T x R)/100 
	Where, 
		P is the principle amount 
		T is the time [year] and 
		R is the rate

 Write a method to convert temperature from Fahrenheit to Celsius degree.
	 Celsius = (fahrenheit - 32) * 5 / 9 */


package tamanna;

public class A8DataTypes {
	
	void simpleInterest(float principleAmount, int time, float rate) {
		float interest=(principleAmount*time*rate)/100;
		System.out.println("Simple interest is : "+ interest);
	}
 
	void convertTemp(float fh) {
		float celsius=(fh-32)*5/9;
		System.out.println("Fahrenheit : "+ fh +" to Celsius : "+celsius);
	}
	
	public static void main(String[] args) {
		 A8DataTypes a8DataTypes=new A8DataTypes();
		 a8DataTypes.simpleInterest(10000, 12, 8.5f);
		 a8DataTypes.convertTemp(60.5f);
	}
}
