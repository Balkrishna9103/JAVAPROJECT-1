package keshav;

class Example12{
	
	void processData(int startR, int endR, int totalCount, int divNum){
		int count = 0;
		for(int num=startR;num<=endR;num++){
			if(num % divNum == 0){
				System.out.println(num);
				count++;
			}
			
			if(count == totalCount){
				break;
			}
		}
	}
	
	public static void main(String[] args){
		Example12 example12 = new Example12();
		example12.processData(100,1000,5,13);
	}
	
}