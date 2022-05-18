//Assignment-6
package sanchit;

class UseWhileLoop{

	void minReqNum(){
		int sum=0;
		int num=0;
		while(sum <= 100){ 
			num++;
			sum = sum + num;
		}
		System.out.println("Minimun required numbers to generate sum 100+ = "+num);
	}
	
	void divBy17or13(int startIndex, int endIndex){
		int count=0;
		int index=startIndex;
		while(index<=endIndex){
			if(index%13 == 0){
				System.out.println(index+" is divisible by 13");
				count++;
			}
			else if(index%17 == 0){
				System.out.println(index+" is divisible by 17");
				count++;	
			}
			index++;
			if(count == 3)
				break;
		}
	}
	
	void divBy5and7(int startIndex, int endIndex){
		int count=0;
		int index=startIndex;
		while(index<=endIndex){
			if(index%5 == 0 && index%7 == 0){
				System.out.println(index);
				count++;
			}
			index++;
			if(count == 2)
				break;
		}
	}
	
	public static void main(String[] args){
		UseWhileLoop useWhileloop = new UseWhileLoop();
		useWhileloop.minReqNum();
		useWhileloop.divBy17or13(5,40);
		useWhileloop.divBy5and7(5,100);
	}
}