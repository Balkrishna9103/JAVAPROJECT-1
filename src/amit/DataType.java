///Assignment - 8 : 19th April'2022

//Create two parameterized methods in same class. 

//Write a method to compute simple interest   
	//Simple Interest = (P x T x R)/100 
	//Where, 
		//P is the principle amount 
		//T is the time [year] and 
		//R is the rate

 //Write a method to convert temperature from Fahrenheit to Celsius degree.
	 //Celsius = (fahrenheit - 32) * 5 / 9


package amit;

public class DataType {
	
	void simpleintrest(double P, double R , double T) {
		double SI = (P*R*T)/100;
		System.out.println("Simple intrest is  :"+ SI);
		}
	void converttemp(double fahrenheit) {
		double Celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Temprature is in Celsius : " + Celsius);
		}
	
	public static void main(String[] args) {
		DataType datatype=new DataType();
		datatype.simpleintrest(1000,4.5,2.0);
		datatype.converttemp(230);
		
	}


}

	