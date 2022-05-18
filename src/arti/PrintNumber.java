package arti;
class PrintNumber{
		
		void divByFive(int startRange, int endRange){
			if(startRange<endRange){
				System.out.println("Numbers divisible by 5 are : ");
				for(int index=startRange; index<=endRange; index ++){
					if(index%5==0)
						System.out.println(index);
				}
			}
			else
				System.out.println("Start Range can not be greater than End Range");
		}
		
		void printNumberDiv(int startRange, int endRange){
			if(startRange<endRange){
				System.out.println("Numbers divisible by 3 and 5 are : ");
				for(int index=startRange; index<=endRange; index ++){
					if(index%3==0 && index%5==0)
						System.out.println(index);
				}
			}
			else
				System.out.println("Start Range can not be greater than End Range");
			
		}
		
		void getSum(int startRange, int endRange){
			int sum=0;
			for(int index=startRange; index<=endRange; index ++)
				sum=sum+index;
			System.out.println("Sum of numbers in the range " + startRange + " to " + endRange + " is = " +sum);
		}
		
		void getDiff(int startRange, int endRange){
			int evenSum=0;
			int oddSum=0;
			int diff=0;
			for(int index=startRange; index<=endRange; index ++){
				if(index%2==0)
					evenSum=evenSum+index;
				else
					oddSum=oddSum+index;
				if(evenSum>oddSum)
					diff=evenSum-oddSum;
				else
					diff=oddSum-evenSum;
					
			}
			System.out.println("Difference between sum of Odd and Even numbers is :" +diff);
		}
		
		
		public static void main(String[] args){
			PrintNumber printNumber = new PrintNumber();
			printNumber.divByFive(10,30);
			printNumber.printNumberDiv(5,18);
			printNumber.getSum(1,5);
			printNumber.getDiff(3,9);
			}
}
