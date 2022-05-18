package rakesh;

public class Assignment8 {
	
	void simpleInterestCal(double principleAmt, double timeInYear, double interestRate) {
		double simpleInterest = (principleAmt*timeInYear*interestRate)/100;
		System.out.println( simpleInterest + " is the simple interest for Rs. "+principleAmt+" for a period of "+timeInYear+" years with interest of "+ interestRate + "% per year");
	}
	
	void tempFehToCel(double tempFeh) {
		double tempCel = (tempFeh -32)*5/9; 
		System.out.println("celcius temperature = " + tempCel);
	}
	public static void main (String[] arg) {
		Assignment8 assignment8 = new Assignment8();
		assignment8.simpleInterestCal(100000, 7.5, 8.5);
		assignment8.simpleInterestCal(100, 5, 5);
		assignment8.tempFehToCel(104);
		assignment8.tempFehToCel(32);
	}
}
