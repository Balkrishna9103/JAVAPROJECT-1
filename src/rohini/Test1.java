package rohini;

public class Test1 {
	int flag=0;
	void checkDivisiability(int a, int b) {
		
		for(int num=a; num<=b; num++) {
			
			if(num%3==0 && num%5==0){
				System.out.println(num+" is divisiable by 3 and 5");
				flag=1;
			}
			
			if(num%3==0 && flag==0) {
				System.out.println(num+" is divisiable by 3");
			}
			
			if(num%5==0 && flag==0) {
				System.out.println(num+" is divisiable by 5");
			}
				flag=0;
		}	
	}
		
	public static void main(String[] args) {
		
		Test1 test = new Test1();
		
		test.checkDivisiability(1,20);
		
		
	}

}
