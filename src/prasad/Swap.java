package prasad;

class Swap{
	
	
	//int a = 10;
	//int b = 20;
	
	void swapNumbers(int a, int b){
		int temp = a;
		a = b;
		b = temp;
		System.out.println("value of a is " + a + " value of b is " + b);
	}
	
	public static void main(String[] args){
		int a = 10;
		int b = 20;
		Swap swap = new Swap();
		//swapNumbers(a,b);
		swap.swapNumbers(a,b);
	}
}