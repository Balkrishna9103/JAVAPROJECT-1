package poojaK;

public class Test1 {
	void example (int startI,int endI){
		for(int num=startI;num<=endI;num++) {
			if (num%3==0 && num%5==0) {
				System.out.println(num+ "is divisible by "+ 3 +"and"+ 5);
			}
			else if (num%3==0) { 
				System.out.println(num+ "is divisible by "+ 3);
			}
			else if (num%5==0) {
				System.out.println(num+ "is divisible by "+ 5);
				}
			}
		System.out.println("Divisible Number is completed");
		}
	public static void main(String[] args) {
		Test1 test1 = new Test1();
		test1.example(1,100);
	}
}
