package pragati;

class Assign6Program3{
	void division(int startindex, int endindex){
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
		Assign6Program3 assign6Program3 = new Assign6Program3();
		assign6Program3.division(5,100);
	}
}