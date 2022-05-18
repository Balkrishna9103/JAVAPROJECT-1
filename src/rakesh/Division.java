package rakesh;
class Division {
	
	void divBy5(int startRange, int endRange) {
		System.out.println("DIVISION BY 5 ==> Range from " + startRange + " to " + endRange);
		for (int index=startRange; index<=endRange; index++) {			
			if (index%5 == 0)
				System.out.println("   " + index + " is divisible by 5.");	
		}
	}
	
	void divBy5and3(int startRange, int endRange) {
		System.out.println("DIVISION BY 5 and 3 both ==> Range from " + startRange + " to " + endRange);
		for (int index=startRange; index<=endRange; index++) {			
			if (index%5 == 0 && index%3 == 0)
				System.out.println("   " + index + " is divisible by 5 and 3 both.");	
		}
	}
	
	void sum(int startRange, int endRange) {		
		int sum=0;
		for (int index=startRange; index<=endRange; index++) {
			sum=sum + index;
		}
		System.out.println("SUM of numbers from " + startRange + " to " + endRange + " is " + sum);
	}
	
	void diff(int startRange, int endRange) {
		int sumofeven=0;
		int sumofodd=0;
		for (int index=startRange; index<=endRange; index++) {	
			if (index%2==0)
				sumofeven=sumofeven+index;
			if (index%2!=0)
				sumofodd=sumofodd+index;
		}
		System.out.println(sumofodd - sumofeven + " is the difference between sum of odd numbers and even numbers from the range " + startRange + " to " + endRange);
	}
		
	public static void main (String[] arg) {
		Division division = new Division();
		division.divBy5(10,30);
		division.divBy5and3(5,18);
		division.sum(1,5);
		division.diff(3,9);
	}
}