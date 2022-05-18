package trupti;
//Write a method that uses a for loop to display numbers in descending order in the step of 5 starting from 100. 
//Call your method from the main method.

class Example1{
	
	void displayDecendingNumbers(){
		for(int index=100; index>=0; ){
			System.out.println("\n"+index);
			index=index-5;
			//index-=5;
		}
	}
	
	// print table of given number
	
	void printTable(int num){
		int num1=0;
		System.out.println("Table of "+num+" is : ");
		for(int index=1;index<=10;index++){
			num1=num*index;
			System.out.println("\n"+num1);
		}
	}
	
	void findNumberIsPrimeOrNot(){
		int num=17;
		boolean flag=true;
		System.out.println("");
		for(int i=2;i<num;i++){
			if(num%i==0){
				System.out.println(num +" is not a prime number");
				flag=false;
				break;
			}
		}
			if(flag){
				System.out.println(num +" is a prime number");
				
			}
		
		}
		
		void disply(){
			int num=1;
			while(num<=20){
				if(num%2==0)
				System.out.println("even number : "+num);
				else
					System.out.println("odd number : " +num);
				num++;
			}
		}
		

		void print(){
			int num=1;
			int sum=0;
			while(num<=5){
				sum=sum+num;
				num++;
			}
			System.out.println("sum = "+sum);
		}
		
	
	public static void main(String[] args){
		Example1 example1=new Example1();
	example1.displayDecendingNumbers();
		//example1.printTable(5);
		//example1.findNumberIsPrimeOrNot();
		//example1.disply();
		example1.print();
	}
}