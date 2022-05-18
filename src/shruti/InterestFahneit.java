package shruti;

public class InterestFahneit {
	   void calculateInterest(float p ,float r , float  t) {
		   float si = (p*r*t)/100;
		   System.out.println("Simple Interest is " + si);
		   
	   }
	   void celcius(double f) {
		   double celcius = (f -32)*5/9;
		   System.out.println("Celcius temperature is " + celcius);
	   }
	   public static void main(String[] args) {
		   InterestFahneit interestFahneit = new InterestFahneit();
		   interestFahneit.calculateInterest(12000, 12, 2);
		   interestFahneit.celcius(56);
		   
		   
	   }

}

	


