package minu;

public class Test1 {
	
	void divByNum(int start, int end) {
		for(int num=start;num<=end;num++) {
			if(num%3==0 && num%5==0) {
				System.out.println(num + " is div by 3 & 5");
			}else if(num%3==0) {
				System.out.println(num + " is div by 3");
			} else if(num%5==0) {
				System.out.println(num + " is div by 5");
			}	
		}
	}

	public static void main(String[] args) {
		Test1 test1 = new Test1();
		test1.divByNum(1, 100);
	}

}
