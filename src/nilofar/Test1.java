package nilofar;

public class Test1 {
	
	void displayNumberDivBy3And5(int num1, int num2) {
		for(int index=num1;index<=num2;index++) {
			if(index%3==0 && index%5==0) {
				System.out.println(index + " is divisible by 3 and 5");
			}
			else if (index%3==0){
				System.out.println(index + " is divisible by 3");
			}else if (index%5==0) {
				System.out.println(index + " is divisible by 5");
			}	
		}
	}
	public static void main (String[]args) {
		Test1 test1 = new Test1();
		test1.displayNumberDivBy3And5(1, 100);
	}
}
