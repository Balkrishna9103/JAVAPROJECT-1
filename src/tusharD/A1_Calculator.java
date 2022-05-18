package tusharD;

public class A1_Calculator {
	
		int number1 = 10;
		int number2 = 2;
		int total;
		
		void add(){
			total = total + (number1 + number2);//12
		}
		
		void sub(){
			total = total + (number1 - number2);
		}
		
		void div(){
			total = total + (number1 / number2);
		}
		
		void mul(){
			total = total + (number1 * number2);
		}
		
		void printTotal(){
			System.out.println(total); //45 
		}
		
		public static void main(String[] args){
			A1_Calculator calculator = new A1_Calculator();
			calculator.add();
			calculator.sub();
			calculator.div();
			calculator.mul();
			calculator.printTotal();
		}
	}


