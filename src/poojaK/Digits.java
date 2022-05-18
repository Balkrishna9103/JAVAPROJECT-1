package poojaK;
class Digits{
	void calculateSum(){
		int num=0;
		int sum=0;
		while(sum<=100){
			num++;
			sum = sum + num;
		}
		System.out.println("***********************");
		System.out.println("Numbers to generate sum 100 is::"+ num);
		System.out.println("***********************");
	}
	
	void calculateDiv(int startI,int endI){
		int count=0;
		int num=0;
		while(startI<=endI){
			num++;
			if(num%17==0 || num%13==0){
				System.out.println(num+ "is divisible by"+ num);
				count++;
			}
			if (count==3)
				break;
		}	
		System.out.println("***********************");
	}
	
	void calculatePrint(int startI,int endI){
		int count=0;
		int num=0;
		while(startI<=endI){
			num++;
			if(num%5==0 && num%7==0){
				System.out.println(num);
				count++;
			}
			if (count==2)
				break;
		}	
		System.out.println("***********************");
	}
	public static void main(String [] args){
	Digits digitsum = new Digits();
	digitsum.calculateSum();
	digitsum.calculateDiv(5,40);
	digitsum.calculatePrint(5,100);
	}
}