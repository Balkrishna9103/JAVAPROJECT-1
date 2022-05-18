package pragati;

class Assign6Program1{
	void processSum(){
		int sum=0;
		int num=1;
		while(sum<=100){
			num++;
			sum=sum+num;
		}
		System.out.println("mininium required numbers "+num);
	}
	
	public static void main(String[] args){
		Assign6Program1 assign6Program1 = new Assign6Program1();
		assign6Program1.processSum();
	}

}