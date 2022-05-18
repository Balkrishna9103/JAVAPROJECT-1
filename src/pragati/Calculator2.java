package pragati;

class Calculator2{
     void add(int n1 ,int n2){
		 System.out.println("Sum is "+(n1+n2));
	 }
	 void sub(int n1 ,int n2){
		 System.out.println("Subtraction is "+(n1-n2));
	 }
	 void mul(int n1 ,int n2){
		 System.out.println("Multification is "+(n1*n2));
	 }
	 void div(int n1 ,int n2){
		 System.out.println("Division is "+(n1/n2));
	 }
	 public static void main(String[] args){
		 Calculator2 calculator2 = new Calculator2();
		 calculator2.add(100,20);
		 calculator2.sub(50,20);
		 calculator2.mul(4,20);
		 calculator2.div(20,10);

	 }


}
