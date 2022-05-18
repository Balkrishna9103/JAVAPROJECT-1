package varsha;
class Test1{
	void getDivisibleNumbers(int startIndex, int endIndex){
		int index=0;
		if(startIndex<=endIndex){
			for(index = startIndex; index<=endIndex; index++){
				if(index%3==0 && index%5==0){
					System.out.println(index+" is divisible by 3 & 5");
				}else if(index%3==0){
					System.out.println(index+" is divisible by 3");
				}else if(index%5==0){
					System.out.println(index+" is divisible by 5");
				}
			}
		}
	}
	
	public static void main(String[] args){
		Test1 test1 = new Test1();
		test1.getDivisibleNumbers(1,100);
	}
}