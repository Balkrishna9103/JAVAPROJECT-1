package pragati;

class Assignment6Whileloop{
	void processSum(){
		int sum=0;
		int num=1;
		while(sum<=100){
			num++;
			sum=sum+num;
		}
		System.out.println("mininium required numbers "+num);
	}

	void division1(int startR, int endR){
		int count=0;
		while(startR<=endR){
			if(startR%17==0){
				System.out.println(startR +" divisible by 17");
				count++;
			}
			else if(startR%13==0){
				System.out.println(startR +" divisible by 13");
				count++;
			} 
			startR++;
			if(count==3){
				break;
			}
		}
	}
	
	void division2(int startindex, int endindex){
		int count=0;
		while(startindex<=endindex){
			if(startindex%5==0 && startindex%7==0 ){
				System.out.println(startindex +" divisible by 5 and 7");
				count++;
			}
			startindex++;
			if(count==2){
	            break;
			}
		}
	}
	
	public static void main(String[] args){
		Assignment6Whileloop assignment6Whileloop= new Assignment6Whileloop();
		assignment6Whileloop.processSum();
		assignment6Whileloop.division1(5,40);
		assignment6Whileloop.division2(5,100);
	}
}