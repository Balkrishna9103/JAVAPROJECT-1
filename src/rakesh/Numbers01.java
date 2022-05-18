package rakesh;
class Numbers01 {
	void divBy7or13(int startR, int endR) {
		System.out.println("1. Division by 7 or 13");
		int count=0;
		for (int num=startR; num<=endR;num++) {
			if (num%7==0){
				System.out.println("    "+num +" is divisible by 7");
				count++;
			}
			if (num%13==0){
				System.out.println("    "+num +" is divisible by 13");
				count++;		
			}
		}
		System.out.println("4. Count of all numbers which are divisible by either 7 or 13 = "+count);
	}
	void oddNum(int startR, int endR) {
		System.out.println("2. First 3 odd numbers in reverse order from range "+startR+ " to "+endR );
		int count=0;
		for (int num=endR; num>=startR;num--) {
			if (num%2!=0){
				System.out.println("     "+num);
				count++;
				if (count==3)
					break;
			}
		}
	}
	void sum(int startR, int endR){
		int sum=0;
		for (int num=startR; num<=endR;num++){
			sum=sum+num;
		}
		System.out.println("3. Sum of all the numbers from range "+startR+" to "+endR+ " is "+sum);
	}	
		
	public static void main(String[] arg) {
		Numbers01 numbers01 = new Numbers01();
		numbers01.divBy7or13(5,40);
		numbers01.oddNum(10,20);
		numbers01.sum(1,5);
		
	}
}



