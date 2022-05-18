package divya;
class AssignmentFive{

	void divideBySevenAndThirteen(int startRange, int endRange){
		for(int index = startRange; index <= endRange; index++){
			if(index%7==0 && index%13==0){
				System.out.println(index + "is divisible by" + index);
	
			}
		}
	}	
					
	public static void main(String[] args){
		AssignmentFive assignmentfive = new AssignmentFive();
		assignmentfive.divideBySevenAndThirteen(5,40);
	}
}