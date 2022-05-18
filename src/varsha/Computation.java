package varsha;
class Computation{
	
	void computeSimpleInterest(long principle, long year, float rate){
		double simpleInterest = (principle*year*rate)/100;
		System.out.println("Interest value for "+year+" years is: " +simpleInterest);
	}
	
	void convertTemperature(float fahTemp){
		float celsiusTemp;
		celsiusTemp = ((fahTemp - 32)*5)/9;
		System.out.println("Temperature in Celsius: "+celsiusTemp);
	}
	
	public static void main(String[] args){
		Computation computation = new Computation();
		computation.computeSimpleInterest(3000000,10,10.5f);
		computation.convertTemperature(85.5f);
	}
}