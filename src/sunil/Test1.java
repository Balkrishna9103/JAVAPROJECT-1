package sunil;
public class Test1 
{
	void numbersDivisible(int startNum, int endNum){
		for( int num=startNum;num<=endNum;num ++){
			if (num%3==0 && num%5==0) {	
			System.out.println(num  + " is Divisible by numbers 3 & 5");
		}
		else if (num%3==0) {	
			System.out.println(num  + " is Divisible by number 3");
		}
		else if (num%5==0) {	
			System.out.println(num  + " is Divisible by number 5");
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 test1= new Test1();
		test1.numbersDivisible(1, 100); 
	}

}
