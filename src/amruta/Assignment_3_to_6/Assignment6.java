/*  Assignment - 6 : 14th April'2022
Use while loop
Program 1:
Write a method to find out minimum required numbers to generate sum 100.
output : 14
Program 2 : 
On user define range print first 3 number which is divisible by 17 or 13. 
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 40
Output : 
		 13 is divisible by 13
		 17 is divisible by 17
		 26 is divisible by 26
Program 3 : 
On user define range print first 2 number which is divisible by 5 and 7. 
Hint : pass start and end index as a parameter.

*/

package amruta.Assignment_3_to_6;

class Assignment6{

	void findNumReqToGetSum100(){
		int sum = 0 , num = 1 , count = 0;
		
		while(sum <= 100){
			sum = sum + num;
			num++;
			count++;
		}
		System.out.println("\n" + count +" numbers required to generate sum 100\n");
	}
	
	void printFirst3NumDivisibleBy17and13(int startNum, int endNum){
	
		System.out.println("\nFirst 3 Numbers divisible by 17 and 13 are:");
		int count = 0;
		
			while(startNum <= endNum){
				
				if(count < 3){
					if (startNum % 13 == 0){
						System.out.println(startNum + " is divisible by 13.");
						count++;
					}
					else if (startNum % 17 == 0){
						System.out.println(startNum + " is divisible by 17.");
						count++;
					}
				}
				startNum++;
			}
	}
	
	void printFirst2NumDivisibleBy5and7(int startNum, int endNum){
	
		System.out.println("\nFirst 2 Numbers divisible by 5 and 7 are:");
		int count = 0;
		
			while(startNum <= endNum){
				
				if(count < 2){
					if (startNum % 5 == 0){
						System.out.println(startNum + " is divisible by 5.");
						count++;
					}
					else if (startNum % 7 == 0){
						System.out.println(startNum + " is divisible by 7.");
						count++;
					}
				}
				startNum++;
			}
	}
	
	public static void main(String[] args){
		Assignment6 assignment6 = new Assignment6();
		assignment6.findNumReqToGetSum100();
		assignment6.printFirst3NumDivisibleBy17and13(5,40);
		assignment6.printFirst2NumDivisibleBy5and7(10,20);
	}
}