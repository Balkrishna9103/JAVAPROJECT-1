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
package keshav;

public class DecimalUsage {
	void compute(int principleAmount, int duration, float rate){
          double interest = (principleAmount*duration*(float)rate)/100;
           System.out.println("Amount of simple interest is : " + interest);
    }
    void temperatureConverter(float temperatureInfahrenheit){
           double celsius = (temperatureInfahrenheit-32) * 5/9;
                   System.out.println("Temperature from " + temperatureInfahrenheit + " fahrenheit to celsius is : " + celsius);
    }
       public static void main (String[] args){
    	   DecimalUsage decimalUsage = new DecimalUsage();
    	   decimalUsage.compute(1000,1,9.5f);
    	   decimalUsage.temperatureConverter(100.05f);
       }

}	
