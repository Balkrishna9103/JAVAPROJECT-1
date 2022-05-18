package keshav;

class Example11{
	
	void processData(){
		int index=1;
		for(;;){
			System.out.println(index);
			index++;
			if(index>10)
				break;
		}
	}
	
	public static void main(String[] args){
		Example11 example11 = new Example11();
		example11.processData();
	}
}