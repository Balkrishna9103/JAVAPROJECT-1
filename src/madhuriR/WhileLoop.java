package madhuriR;
class WhileLoop{
	void printData(){
		int sum =0;
		int num = 1;
		while(sum<=100){
			num++;
			sum = sum+num;	 
		}
		System.out.println(num);
		System.out.println("********************************************");
	}
	
	void verifyData(int sRange,int eRange){
		int count = 0;
		while(sRange<=eRange){
			if(sRange%13==0){
				System.out.println(sRange+" is divisible by "+sRange);
				count++;
			}else if(sRange%17==0){
				System.out.println(sRange+" is divisible by "+sRange);
				count++;
			}
			sRange++;
			if(count ==3){
				break;
			}	
		}
		System.out.println("********************************************");	
	}
	
	void displayData(int startRange, int endRange){
		int count = 0;
		while(startRange<=endRange){
			if(startRange%5==0 && startRange%7==0){
				System.out.println(startRange);
				count++;	
			}
			startRange++;
			if(count==2){
				break;	
			}
				
		}
		System.out.println("********************************************");
	}
	
	public static void main(String[] args){
		WhileLoop whileloop = new WhileLoop();
		whileloop.printData();
		whileloop.verifyData(5,40);
		whileloop.displayData(5,100);
	}
}