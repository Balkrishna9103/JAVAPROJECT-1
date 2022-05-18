package prabhat;
class Assignment6{

	void numsum(){
		 int sum=0;
		 int num=0;
		 while (sum<=100){
			num++;
			sum=sum+num;
		}
		System.out.println("Minimum Required Numbers = "+num);
		System.out.println("**************************************");
	}
	
	void divisible(int start,int end){
		int count = 0;
		while(start<=end){
			if (start%17==0){
				System.out.println(start+" divisible by 17");
				count++;
			}
			else if (start%13==0){
				System.out.println(start+" divisible by 13");
				count++;
			}
			start++;
			if (count==3)
			break;
		}
		System.out.println("**************************************");
	}
		
	void print(int start, int end){
		System.out.println("Numbers divisible by 5 & 7");
		int count = 0;
		while(start<=end){
		  if (start%5==0 && start%7==0){
		     System.out.println(start);
			 count++;
			}
			 start++;
			 if (count==2)
			 break;
		}
		System.out.println("**************************************");
	}		
			public static void main(String[] args){
			Assignment6 assignment = new Assignment6();
			assignment.numsum();
			assignment.divisible(5,40);
			assignment.print(5,100);
		
	}
}