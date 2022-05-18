/*Create two parameterized methods in same class. 
Write a method to compute simple interest   
	Simple Interest = (P x T x R)/100 
	Where, 
		P is the principle amount 
		T is the time [year] and 
		R is the rate

 Write a method to convert temperature from Fahrenheit to Celsius degree.
	 Celsius = (fahrenheit - 32) * 5 / 9
*/
package dnyaneshari;

public class DataTypes {
	
	double interest;
	double celsius;

	void simpleInterest(int p,int y,float r) {
		interest=(p*y*r)/100;
		System.out.println("Interest on "+p+" amount in "+y+" years with rate of interest "+r+" is "+interest);
		
	}
	
	void temperature(double fahrenheit) {
		celsius=(fahrenheit-32)*5/9;
		System.out.println(fahrenheit+" is equal to "+ celsius+" degree celsius");
		
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		DataTypes dataTypes=new DataTypes();
		dataTypes.simpleInterest(10000, 5, 8.6f);
		dataTypes.temperature(33.8);
		dataTypes.simpleInterest(254000,10,6.75f);
		dataTypes.temperature(70);
		
		

	}

}
