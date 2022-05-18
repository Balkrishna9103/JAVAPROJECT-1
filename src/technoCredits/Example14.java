package technoCredits;

class Example14{
	int count;
	void processData(){
		int sum = 0;
		int num = 0;

		while(sum <= 180){
			num++; //1 //2 //3 //4 //5 //6
			sum = sum + num; //1 //3 //6 //10 //15 //21
		}
		System.out.println(num); //6
	}
	
	void processData1(){
		int sum = 0;
		for(int num=0;sum <= 180;num++){
			//num++; //1 //2 //3 //4 //5 //6
			sum = sum + num; //1 //3 //6 //10 //15 //21
		}
		//System.out.println(num); //6
	}
	
	void processData2(){
		for(int index=1;index<=10;index++){
			count = count + 10;
		}
		
		int index=1;
		while(index<=10){
			count = count + 10;
			index++;
		}
	}
	
	public static void main(String[] arg){
		Example14 example14 = new Example14();
		example14.processData();
	}
}