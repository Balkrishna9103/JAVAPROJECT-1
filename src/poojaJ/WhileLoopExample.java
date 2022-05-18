/* Program 1:
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
Input : Range -> 5 to 100
Output : 
		 35
		 70 */
package poojaJ;

class WhileLoopExample{
	
	void minNumbersToSum(){
		int num=0;
		int sum=0;
		while (sum<=100){
			num++;
			sum=sum+num;
		}
		System.out.println(num);
	}
	
	void printFirstThreeNumbers(int startNum, int endNum){
		System.out.println();
		int count=0;
		while (startNum<=endNum){
			if (startNum % 13==0){
				System.out.println(startNum +" is divisible by 13");
				count++;
			}else if (startNum %17==0){
				System.out.println(startNum +" is divisible by 17");
				count++;
			}
			startNum++;
			if (count == 3){
				break;
			}
		}
	}
	
	void printTwoNumbers(int startNum, int endNum){
		System.out.println();
		int count=0;
		while (startNum<=endNum){
			if (startNum % 5==0 && startNum % 7==0){
				System.out.println(startNum);
				count++;
			}
			startNum++;
			if (count==2){
				break;
			}
		}
	}

	public static void main(String[]args){
		WhileLoopExample whileLoopExample = new WhileLoopExample();
		whileLoopExample.minNumbersToSum();
		whileLoopExample.printFirstThreeNumbers(5,40);
		whileLoopExample.printTwoNumbers(5,100);
		}
}