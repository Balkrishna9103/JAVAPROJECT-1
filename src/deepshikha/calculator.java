package deepshikha;

public class calculator {
	    int num1=10;
		int num2=2;
		int bhu=12;
		
		void add(){
		 int ans = num1 + num2;
		 int gdk = ans;
		 System.out.println("Sum Is " + ans);
		}
		void sub(){
			int ans1 = num1 -num2;
			System.out.println("sub Is " + ans1);
		}
		void mul(){
			int ans2 = num1 * num2;
			System.out.println("Multiplication Is " + ans2);
		}
		void div(){
			int ans3 = num1 / num2;
			System.out.println("Division Is " + ans3);
			
		}
		void move(){
			int bg = bhu; 
			System.out.println(bg);
		}
		public static void main(String[] args){
		 calculator cal = new calculator();
		 cal.add();
		 cal.sub();
		 cal.mul();
		 cal.div();
		 cal.move();
		  }
	}


