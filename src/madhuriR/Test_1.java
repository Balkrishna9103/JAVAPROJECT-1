package madhuriR;

public class Test_1 {
	void divNum(int sRange,int eRange) {
		for(int index=sRange;index<=eRange;index++) {
			if(index%3 ==0 && index%5==0) {
				System.out.println(index+" is div by 3 & 5");
			}else if(index%3==0) {
				System.out.println(index+" is div by 3");
			}else if(index%5==0)
				System.out.println(index+" is div by 5");		
		}	
	}
	public static void main(String[] args) {
		Test_1 test_1 = new Test_1();
		test_1.divNum(1,100);
	}
}
