package pratikK;
class Numbers{
	void display1(int startindex,int endindex){
		for(int num=startindex; num<=endindex; num++){
			if(num%5==0){
				System.out.println("Number between 10 & 30 which are divisible by  5 = "+num);
			}
		}	
	}
	void display2(int startindex,int endindex){
		for(int num=startindex; num<=endindex; num++){
			if(num%5==0 && num%3==0){
				System.out.println("Number between 5 & 18 which is divisible by 3 & 5 = "+ num);
			}
		}	
	}
	int Sum=0;
	void display3(int startindex,int endindex){
		for(int num=startindex; num<=endindex; num++){
			Sum=Sum+num;
		}	
		System.out.println("Sum of numbers 1 to 5 = "+Sum);
	}
	int Sum1=0;
	int Sum2=0;
	void display4(int startindex,int endindex){
		for(int num=startindex; num<=endindex; num++){
			if(num%2==0){
				 Sum1=Sum1+num;				
			}
		}	
		for(int num=startindex; num<=endindex; num++){
			if(num%2!=0){
				 Sum2=Sum2+num;				
			}
		}	
		int Sum3=Sum2-Sum1;{
		System.out.println("Difference between sum of even numbers & odd numbers of range 3 to 9 = " +Sum3);
		}
	}
	public static void main (String[] args){
		Numbers numbers=new Numbers();
		numbers.display1(10,30);
		numbers.display2(5,18);
		numbers.display3(1,5);
		numbers.display4(3,9);
	}

}	