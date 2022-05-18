package pragati;

class Assign6Program2{
	void division(int startR, int endR){
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
	
	public static void main(String[] args){
		Assign6Program2 assign6Program2 = new Assign6Program2();
		assign6Program2.division(5,40);
	}
}