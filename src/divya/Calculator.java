package divya;
class Calculator{
		
	void addition(int x, int y){
		
		System.out.println("Sum is " + (x+y));
		
		}
		
		void substraction(int x, int y){
		
		System.out.println("Substraction is " + (x-y));
		
		}
		
		void multiplication(int x, int y){
		
		System.out.println("Multiplication is " + (x*y));
		
		}
		
		void division(int x, int y){
		
		System.out.println("Division is " + (x/y));
		
		}
		
		public static void main(String[] args){
			Calculator calculator = new Calculator();
			calculator.addition(100, 200);
			calculator.substraction(100, 200);
			calculator.multiplication(100, 200);
			calculator.division(200, 100);
					
			}
	}		