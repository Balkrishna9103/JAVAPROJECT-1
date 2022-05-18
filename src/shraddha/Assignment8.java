/*Assignment - 8 : 19th April'2022

Create two parameterized methods in same class. 

1. Write a method to compute simple interest   
	Simple Interest = (P x T x R)/100 
	Where, 
		P is the principle amount 
		T is the time [year] and 
		R is the rate

2. Write a method to convert temperature from Fahrenheit to Celsius degree. 
	Celsius = (fahrenheit - 32) * 5 / 9
*/

package shraddha;

class Assignment8
{
	void simpleInterest(int principle, int time, float rate)
	{
		System.out.println("1. Computed Simple Interest of Principle-" +principle +" , Time-" +time +" and Rate-" + rate +" is : " +((principle*time*rate)/100));
	}
	
	void convertTemp(int fahrenheit)
	{
		System.out.println("2. Converted temperature from Fahrenheit-" + fahrenheit +" to Celsius degree is : " +((fahrenheit - 32) * 5 / 9));
	}
	
	public static void main(String[] args)
	{
		Assignment8 cal = new Assignment8();
		cal.simpleInterest(100,10, 6.5f);
		System.out.println();
		cal.convertTemp(50);
	}
}
