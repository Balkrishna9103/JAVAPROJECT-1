package pratikK;

public class Test1 {
	int num=0;
	void divBy3Or5(int startRange,int endRange) {
		for(num=startRange;num<=endRange;num++) {
			if(num%3==0){
				System.out.println(num+" is divisible by 3 ");
			}
			else if(num%5==0){
				System.out.println(num+" is divisible by 5");
			}
			 if(num%3==0 && num%5==0){
				System.out.println(num+" is divisible by 3 & 5 ");
			}
		}	
	}
	public static void main (String[] args){
		Test1 test1=new Test1();
		test1.divBy3Or5(1,100);
	}
}
