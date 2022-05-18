package yash;

public class Assignment8 {
	int simpleInterest = 0;
	int celcius = 0;
	
	void m1(int P, int T, int R) {
		
		simpleInterest=(P * T * R)/100;
		System.out.println("simpleInterest=(P * T * R)/100");
		System.out.println("where,                        ");
		System.out.println("      P is the principle amount");
		System.out.println("      T is the time period in years");
		System.out.println("      R is the rate of interest in percentage");
		System.out.println("                                   ");
		System.out.println("Simple Interest is " +simpleInterest);
		}
	
		void m2(int fahrenheit) {
			
			celcius=(fahrenheit-32)*5/9;
			System.out.println("Celcius is "+celcius);
			
		}

		public static void main (String[] args) {
			Assignment8 assignment8 = new Assignment8();
			assignment8.m1(1000,2,12);
			System.out.println("                       ");
			System.out.println("=======================");
			System.out.println("                       ");
			assignment8.m2(105);
		}
}
