package prachi;

public class Assignment8 {

	
	void simpleIntrest(int P, int T, double R){
		 double SI;
		 SI = (P * T * R) / 100;
        System.out.println("The Simple Interest is : " + SI);
		
	}
		
		void convertTemp(float fahernheit ) {
			double Clecius;
			Clecius = (fahernheit - 32) * 5 / 9;
			System.out.println("Temprature is " + Clecius);
		}
		public static void main(String[] args){
			Assignment8 assignment8 = new Assignment8();
			assignment8.simpleIntrest(70000, 5, 8.50);
			assignment8.convertTemp(58);
}
}
