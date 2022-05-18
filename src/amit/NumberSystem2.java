package amit;

class NumberSystem2{
	
	void sum(){
		int sum=0;
		int num=0;
		while(sum<=100){
			num++;
			sum=sum+num;
		}
		
		System.out.println("total no:" + num);
	}
		
		
		void divnumber(int startnum, int endnum){
			int count=0;
			while(startnum<=endnum){
				if(startnum%13==0){
					System.out.println(startnum + " no is divisible by 13");
					count++;
				}
				else if (startnum%17==0){
					System.out.println(startnum + " no is divisible by 17");
					count++;
				}
				startnum++;
				if (count==3)
					break;
				}
			if (count<3)
				System.out.println("we could not find 3 no in given range");
		}
		void divnumber1(int startnum, int endnum){
			int count=0;
			while(startnum<=endnum){
				if(startnum%5==0 && startnum%7==0){
					System.out.println(startnum);
					count++;
				}
				startnum++;
		}
			
	}
	public static void main(String[] args){
		NumberSystem2 numbersystem2 = new NumberSystem2();
		numbersystem2.sum();
		numbersystem2.divnumber(5,40);
		numbersystem2.divnumber1(5,100);
	} 
		
}