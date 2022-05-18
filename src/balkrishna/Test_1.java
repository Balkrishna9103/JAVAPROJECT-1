package balkrishna;

class Test_1{

	void ProcessData(int StartRange, int EndRange) {
		for(int num=StartRange; num<=EndRange; num++) {
			if(num%3==0 && num%5==0)
				System.out.println(num + " is divisible by 3 and 5");
			else if(num%3==0)
				System.out.println(num + " is divisible by 3");
			else if(num%5==0)
				System.out.println(num + " is divisible by 5");
		}
	}

	public static void main(String[] args) {
		Test_1 Test_1 = new Test_1();
		Test_1.ProcessData(1,100);
	}
 
}