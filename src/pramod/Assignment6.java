/* Assignment - 6 : 14th April'2022

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
Input : Range -> 5 to 100
Output : 
		 35
		 70 */
package pramod;

class Assignment6{
	
	void inputData(){
		int sum=0;
		int num=1;
		while(sum<=100){
			num++;
			sum=sum+num;
		}
		System.out.println("Minumum required numbers to generate sum=100 are " +num);
	}
	
	void processData(int sRange, int eRange){
		while(sRange<=eRange){
			if(sRange%13==0)
				System.out.println(sRange + " is divisible by 13");
			else if(sRange%17==0)
				System.out.println(sRange + " is divisible by 17");
		sRange++;	
		}
	}
	
	void printData(int sRange, int eRange){
		System.out.println("Numbers divisible by 5 and 7 are");
		while(sRange<=eRange){
			if(sRange%5==0 && sRange%7==0)
				System.out.println(sRange);
			sRange++;
		}
	}
	
	
	public static void main(String[] args){
		Assignment6 assignment6 = new Assignment6();
		assignment6.inputData();
		assignment6.processData(5,40);
		assignment6.printData(5,100);
	}
}