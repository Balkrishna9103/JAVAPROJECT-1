package vrinda;
class Calculator{
	
	void add(int n1,int n2){
	int ans=n1+n2;
	System.out.println("Sum is:"+ans);
	}
	
	void sub(int n1,int n2){
	int ans=n1-n2;
	System.out.println("substrction is:"+ans);
	}
	
	void mul(int n1,int n2){
	int ans=n1*n2;
	System.out.println("Multipicatin is:"+ans);
	}
	
	void div(int n1,int n2){
	int ans=n1/n2;
	System.out.println("Division is:"+ans);
	}
	
	public static void main(String[]args){
	
	Calculator calculator=new Calculator();
	calculator.add(10,5);
	calculator.sub(10,5);
	calculator.mul(10,5);
	calculator.div(10,5);
	}
	
}