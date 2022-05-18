package tusharB;
class Assignment6{
	void sum(){
		int i=0;
		int j=0;
		while(i<=100){
			j++;
			i=i+j;
		}System.out.println("sum of no is " + j);
		System.out.println();
		
	}
	void divisible(int startR, int endR){
		int count=0;
		while(startR<=endR){
			if(startR%17==0){
				System.out.println(startR +" divisible by 17");
				count++;
			}
			else if(startR%13==0){
				System.out.println(startR + " divisible by 13");
				count++;
			}
		startR++;
		if (count == 3)
			break;
		}
		System.out.println();
	}
	void divFiveSeven(int startR, int endR){
		System.out.println("Number divisible by 5 and 7 is ");
		while(startR <= endR)
		{
			int count=0;
			if(startR % 5==0 && startR % 7==0)
			{
				System.out.println(startR);
				count++;
			}
			startR++;
			if(count==2)
			break;
		}
	}

	public static void main(String[] args){
		Assignment6 assignment6 = new Assignment6();
		assignment6.sum();
		assignment6.divisible(5,40);
		assignment6.divFiveSeven(5,100);
	}
}