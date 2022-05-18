package technoCredits;

class Example10{
	
	void display(){
		for(int index=1;index<=100;index++){
			System.out.println("Maulik - " + index);
		}	
	}
		
	void revDisplay(String name){
		System.out.println("Start");
		for(int index=100;index>=1;index--){
			System.out.println(name + " - " + index);
		}
		System.out.println("End");
	}
	
	void revDisplayOnRange(String name, int startRange, int endRange){
		//if(startRange < endRange){
			for(int index = endRange; index>=startRange; index--)
				System.out.println(name + " - " + index);	
		//}else{
		//	System.out.println("Invalid range, start range should be lower than end range");
		//}
	}
	
	void doSum(){
		int sum=0;
		int count = 0;
		for(int num=1;num<=100;num++){
			if(num%2==0){
				sum = sum + num;
				count = count+1;
				System.out.println(num);
			}
		}
		System.out.println(sum);
		System.out.println(count);
	}
	
	public static void main(String[] args){
		Example10 example10 = new Example10();
		example10.revDisplayOnRange("Pooja", 50, 100);
	}
}