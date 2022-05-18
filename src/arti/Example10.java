package arti;
class Example10{
	
	void display(int startRange,int endRange){
			if(startRange<endRange){
				for(int index=startRange;index<=endRange;index++)
				System.out.println("Arti - " + index);
			}
			else
				System.out.println("StartRange can not greater than endRange");
	}
	
	void reverseDisplay(int startRange, int endRange){
			
			int sum=0;
			
			for(int index=startRange;index>=endRange;index--){
				if(index%3==0 && index%5==0){
					System.out.println("Arti - " + index);
					sum=sum+index;
				}
			}
			System.out.println(sum);
	}
	
	public static void main(String[] args){
		Example10 example10= new Example10();
		example10.display(10,2);
		example10.reverseDisplay(100,1);
		
	}
}
