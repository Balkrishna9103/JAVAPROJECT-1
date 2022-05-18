package minu;

class Range{
	
	void divBy7Or13(int start,int end, int totalCount){
		int count = 0;
		for(int num=start;num<=end;num++){
			if(num%7 == 0 || num%13 == 0){
				System.out.println("Number divisible by 7 or 13 is: " + num);
				count++;
			}
			if(count == totalCount)
				break;
		}
	}
	void revOddNum(int start,int end){
		int count=0;
		for(int num=end; num>=start;num--){
			if(num%2 !=0){
				System.out.println("Odd number is: " + num);
				count++;
			}
			if(count == 3)
				break;
		}
	}
	void sum(int start,int end){
		int totalSum=0;
		for(int num=start; num<=end; num++){
			totalSum = totalSum + num;
		}
		
		System.out.println("Sum of total number is: " + totalSum);
	}
	void numDivBy7Or13(int start,int end){
		int count = 0;
		for(int num=start;num<=end;num++){
			if(num%7 == 0 || num%13 == 0){
				count++;
			}
		}
		System.out.println("Total number divisible by 7 or 13 is: " + count);
	}
	public static void main(String[] args){
		Range range = new Range();
		range.divBy7Or13(5,40,5);
		range.revOddNum(10,20);
		range.sum(1,5);
		range.numDivBy7Or13(5,40);
	}
}