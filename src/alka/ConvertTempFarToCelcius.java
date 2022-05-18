package alka;

public class ConvertTempFarToCelcius {
	double simpleInterest;
	
	float celsius;
	void calSimpleInterest(double principleamt,int year, float rateOfInterest )
	{
		simpleInterest= (principleamt * year * rateOfInterest)/100;
		System.out.println("simpleInterest is "+ simpleInterest);
	}
	
	void convertFarentoCelcious(float fahrenTemp) 
	{
		celsius=(fahrenTemp-32)*  5/9;
		System.out.println("Converted Temp is "+ celsius);
	}
	
	public static void main(String[] args)
	{
		ConvertTempFarToCelcius  converttempfartocelcius =new ConvertTempFarToCelcius();
		converttempfartocelcius.calSimpleInterest(5000.2, 4, 6.4f);
		converttempfartocelcius.convertFarentoCelcious(78);
	}
	

}
