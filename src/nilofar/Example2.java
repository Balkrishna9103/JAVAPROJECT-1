package nilofar;

class Example2{
	int num1 = 20;
	int num2 = 10;
	
	void updateNumber (){
		num1 = 5;
		num2 = 6;
	}
	
	void display(){
		System.out.println(num1+num2);
	}
	
	public static void main(String[] args){
		Example2 example21 = new Example2();
		Example2 example22 = new Example2();
		
		example21.updateNumber();
		example21.display();
		example22.display();
	}

}