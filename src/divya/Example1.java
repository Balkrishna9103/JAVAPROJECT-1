package divya;
class Example1{


	int num1 = 10;
	int num2 = 20;
	
	void updateNumbers(){
		num1 = num1+num2;
		num1 = 5;
		num2=6;
		
		}
		
	void processData(){
		 System.out.println(num1+num2);
		}
	
	public static void main(String[] args){
		 
	    Example1 example1 = new Example1();
	    example1.processData();
	    example1.updateNumbers();
		 
		 }
}