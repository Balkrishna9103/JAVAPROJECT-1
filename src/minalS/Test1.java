package minalS;

public class Test1 {
	
	void numberDiv(int startR,int endR) {
		for(int index=startR;index<=endR;index++) { 
			if(index%3==0 && index%5==0){
				System.out.println(index+" is divisible by "+3+" and "+ 5);
			}else if(index%3==0) {
				System.out.println(index+" is divisible by "+3);
			}else if(index%5==0) {
				System.out.println(index+" is divisible by "+5);
			}
		}
	}
	
	public static void main(String[] args) {
		Test1 test1=new Test1();
		test1.numberDiv(1,100);
	}

}
