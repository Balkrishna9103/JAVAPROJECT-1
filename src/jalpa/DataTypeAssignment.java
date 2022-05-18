/* Create two parameterized methods in same class. 

Write a method to compute simple interest   
	Simple Interest = (P x T x R)/100 
	Where, 
		P is the principle amount 
		T is the time [year] and 
		R is the rate

 Write a method to convert temperature from Fahrenheit to Celsius degree.
	 Celsius = (fahrenheit - 32) * 5 / 9 */
package jalpa;

public class DataTypeAssignment {
	void simpleIntrest (int pAmount, int year , double rate){
		double simpleIntrest = (pAmount*year*rate)/100 ;
		System.out.println("Simple Intreset= (P*N*R) /100");
		System.out.println("Simple Intreset=("+ pAmount+"*"+year+"*"+rate +")/100 = " + simpleIntrest);
	}
	void convert (double fernhit) {
		float celcious = (float)(fernhit -32)*5/9 ;
		System.out.println("Celcious= fernhit-32*5/9 = " );
		System.out.println("Celcious= "+ fernhit + "-32*5/9 = " + celcious);	}
	public static void main(String[] args) {
		DataTypeAssignment dataTypeAssignment = new DataTypeAssignment () ;
		dataTypeAssignment.simpleIntrest(5000 , 8 ,9.5);
		dataTypeAssignment.convert (200.50);
	}
	
}
