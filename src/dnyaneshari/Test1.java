package dnyaneshari;

public class Test1{

	
	void divisibleByNumber(int startR,int endR){
		
		while(startR<=endR) {
			if(startR%3==0 && startR%5==0) {
				System.out.println(startR+" is divisible by 3 and 5");
			}else if(startR%3==0) {
				System.out.println(startR+" is divisible by 3");
			}else if(startR%5==0) {
				System.out.println(startR+" is divisible by 5");
		    }
			startR++;
		} 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 test1=new Test1();
		test1.divisibleByNumber(1,100);
	}

}
