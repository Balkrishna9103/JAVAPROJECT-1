package amit;

class NumberSystem{
	
	void divby5(int startnum, int endnum){
		
		for(int num=startnum;num<=endnum;num++)
			if(num%5==0)
				System.out.println("number div by 5 between 10 to 30:" + num);
	}
	
	void divby5and3(int startnum, int endnum){
		for(int num=startnum; num<=endnum; num++)
			if(num%5==0 && num%3==0)
				System.out.println("Number div by 5 & 3 :" + num);
	}
	void sum(int startnum, int endnum){
		int sum=0;
		for(int num=startnum;num<=endnum;num++)
			sum=sum+num;
				System.out.println("Sum of numers :" + sum);
	}
	void diff(int startnum, int endnum){
		int evensum=0;
		int oddsum=0;
		for(int num=startnum;num<=endnum;num++)
			if (num%2==0)
				evensum=evensum+num;
			else oddsum=oddsum+num;
				System.out.println("Diff between sum of even and odd numberd :" + (oddsum-evensum));
									
	}
			
	public static void main(String[] args){
	NumberSystem numbersystem = new NumberSystem();
	numbersystem.divby5(10,30);
	numbersystem.divby5and3(5,18);
	numbersystem.sum(1,5);
	numbersystem.diff(3,9);
	}
	


}