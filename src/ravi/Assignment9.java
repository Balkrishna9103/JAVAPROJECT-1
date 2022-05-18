package ravi;

public class Assignment9 {

	void simpleInterest(float principal,float interest ,float time){
		
		float SI =(principal*interest*time)/100;
		System.out.println("Simple Interest is : "+SI);
		
	}
	
	void tempCelciusFromFahrenheit(double fahrenheit){
		
		System.out.println( "Celcius"+(fahrenheit-32)*5/9);
	}
	
	public static void main(String[] args) {
		Assignment9 as9 = new Assignment9();
		as9.simpleInterest(2420000,8,8);
		as9.tempCelciusFromFahrenheit(92);
		
	}

}

