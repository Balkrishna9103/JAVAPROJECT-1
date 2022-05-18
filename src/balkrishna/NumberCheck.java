//Assignment no=5
package balkrishna;
class NumberCheck{
	 void DivNum(int StartNum, int EndNum){
		 int count=0;
		 for(int index=StartNum;index<=EndNum;index++){
			 if (index%7==0){
				 System.out.println(index+"  Divisible num by 7 ");
				 count++;
			 }
			 if(index%3==0){
				 System.out.println(index+"  Divisible num by 13  ");
				 count++;
			 }
			 if (count==5)
				 break;
		 }
			 
	 }
	void OddNum(int StartNum, int EndNum){
		 int count=0;
		 for(int num=StartNum;num>=EndNum;num--){
			 if (num%2!=0){
				 System.out.println(num);
				 count++;
			 }
			 if(count==3)
				 break;
		 }	 
	}
	void SumNum(int startNum, int endNum){
		int sum=0;
		for(int data=startNum;data<=endNum;data++){
			sum=sum+data;
		}
		System.out.println(" sum of number is = "+sum);
	}
	void CountNum(int startRange,int endRange){
		int count=0;
		for(int num=startRange;num<=endRange;num++){
			if(num%7==0 || num%3==0){
				count++;
			}
		}
	        System.out.println("total count of 7 or 3 is ="+count);
	}
	
	public static void main(String[] args){
		NumberCheck NumberCheck = new NumberCheck();
		NumberCheck.DivNum(5,40);
		NumberCheck.OddNum(10,20);
		NumberCheck.SumNum(1,5);
		NumberCheck.CountNum(5,40);
	}
}



