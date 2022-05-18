package rakesh;
class WhileLoop01 {
	
	void numbers () {
		int count=0;
		int sum=0;
		int num=0;
		while(sum<=100){
			count++;
			num++;
			sum=sum+num;				
		}
		System.out.println("minimum required numbers to generate sum 100 = " + count);
	}
	
	void divBy17or13 (int startR, int endR) {
		int num = startR;
		int count=0;
		while(num<=endR){
			if(num%13==0){
				System.out.println("   "+num + " is divisible of 13");
				count++;
			}
			else if(num%17==0){
				System.out.println("   "+num + " is divisible of 17");
				count++;
			}
			num++;
			if(count==3){
				System.out.println("first 3 numbers found which are divisible by 13 or 17");
				break;	
			}
			if(num>endR){
				System.out.println("end range reached");
				break;
			}
		}	
	}
	
	void divBy5and7 (int startR, int endR) {
		int num = startR;
		int count=0;
		while (num<=endR){ 
			if(num%5==0 && num%7==0){
				count++;
				System.out.println("   "+num);
			}
			num++;
			if (count==2){
				System.out.println("first 2 numbers found which are divisible by 5 and 7");
				break;
			}
			if (num>endR){
				System.out.println("end range reached");
				break;			
			}
		}
	}
	
	public static void main(String[] arg){
	WhileLoop01 whileLoop01 = new WhileLoop01();
	whileLoop01.numbers();
	whileLoop01.divBy17or13(5,40);
	whileLoop01.divBy5and7(5,100);
	}
}