package prabhat;
class Assignment4 {

     void divisibleby5(int startRange,int endRange)
		{
		System.out.println("Number divisible by 5 are:");
		for (int index=startRange;index<=endRange;index++)
		{
		if(index%5==0)
		System.out.println(" " +index);
		}
	}
		void divisibleby5and3(int startRange, int endRange)
	{
		for(int index=startRange; index<=endRange; index++)
		{
		if(index%5==0 && index%3==0)
			System.out.println("Numbers divisible by 5 and 3 are: " +index);
	}
	}
	void sumofNumbers(int num1,int num2)
	{
	int sum=0;
      for(int index=num1;index<=num2;index++)
     {
	sum = sum+index;
	}
    System.out.println("Sum of numbers are :" +sum);
	}
	void diffofNumbers(int startRange, int endRange)
	{
		 
	int sumofeven=0;
	int sumofodd=0;
	int diff=0;
	for(int index=startRange; index<=endRange; index++)
	{
	if(index%2==0)

		sumofeven = sumofeven+index;
	else
		sumofodd = sumofodd+index;
		}
		diff=sumofodd-sumofeven;
		System.out.println("diff is :"  +diff);
}

		public static void main(String[] args){
			Assignment4 assignment4 = new Assignment4();
			assignment4.divisibleby5(10,30);
			assignment4.divisibleby5and3(5,18);
			assignment4.sumofNumbers(1,5);
			assignment4.diffofNumbers(3,9);
		}

}