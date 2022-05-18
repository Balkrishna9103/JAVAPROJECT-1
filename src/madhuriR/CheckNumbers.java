package madhuriR;
// Assignment_4 
class CheckNumbers{
	void verifyNumber(int start , int end){
		for(int index = start; index<= end; index++){
			if(index%5 == 0){
				System.out.println("number divisible by 5 "+index);	
			}
		}
	}
	void checkNum(int startRange,int endRange){
		for (int num = startRange; num<=endRange; num++){
			if(num%5==0 && num%3==0){
				System.out.println("The number is divisible by 5 as well as 3 is: "+num);
			}
		}
	}
	void sumNumber(int startIndex,int endIndex){
		int sum = 0;
		for(int i = startIndex; i<=endIndex; i++){
			sum = sum +i;
		}
		System.out.println("Sum of numbers is "+sum);	
	}
	void diffNumbers(int startNum,int endNum){
		int sumofodd = 0;
		int sumofevn = 0;
		for(int data = startNum; data<= endNum; data++){
			if(data%2==0){
				sumofevn = sumofevn+data;
			}else{
				sumofodd = sumofodd+data;
			}
		}
		System.out.println("sum of even number is "+sumofevn);
		System.out.println("sum of odd number is  "+sumofodd);
		System.out.println("Difference between sum of odd and even number is :"+(sumofodd-sumofevn));	
	}
	public static void main(String[] args){
		CheckNumbers checknumber = new CheckNumbers();
		checknumber.verifyNumber(10,30);
		checknumber.checkNum(5,18);
		checknumber.sumNumber(1,5);
		checknumber.diffNumbers(3,9);
	}
}