package ashish;

class ExampleSix{

	int num = 10;
	
	void display(){
		int num1 = 20;
		System.out.println("local veriable " + num1);
		System.out.println("Instance veriable " +num);
	}
	
	public static void main(String[] args){
		ExampleSix exampleSix = new ExampleSix();
		exampleSix.display();
	}

}
