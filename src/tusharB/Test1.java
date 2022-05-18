package tusharB;

public class Test1 {
	void divisible( int startR,int endR)
	{
		for(int index=startR;index<=endR;index++){
			if(index%3==0){
				System.out.println(index+" number is divisible by 3");
			}
			if(index%5==0){
				System.out.println(index+" number is divisble by 5");
			}
			if(index%3==0 && index%5==0){
				System.out.println(index+ " number is divisble by 3 and 5");
			}
	}
	}
	public static void main(String[] args){
		Test1 test1=new Test1();
		test1.divisible(1, 100);
	}
}
