package arti;
class PrintNumber1{

		void numberDivBy(int startRange, int endRange){
			int count=1;
			System.out.println("Numbers divisible  by 7 or 13 are : ");
			for(int number=startRange;number<=endRange;number++){
				if(number%7==0 || number%13==0){
					if(count<=5)
					System.out.println(number);
					count++;
				}
			}
		}
		
		void printOdd(int startRange,int endRange){
			int count=1;
			System.out.println("First 3 Odd numbers in the given range are : ");
			for(int number=endRange;number>=startRange;number--){
				if(count<=3){
					if(number%2!=0){
						System.out.println(number);
						count++;
					}
				}
			}
		}
		
		void dispNumber(int startRange,int endRange){
			
			int count=0;
			for(int number=startRange;number<=endRange;number++){
				if(number%7==0 || number%13==0)
				count++;
			}
			System.out.println("Total number of odd numbers in given range are : " +count);
		}
		public static void main(String[] args){
			
			PrintNumber1 printNumber1=new PrintNumber1();
			printNumber1.numberDivBy(5,40);
			printNumber1.printOdd(10,20);
			printNumber1.dispNumber(5,40);
		}
}