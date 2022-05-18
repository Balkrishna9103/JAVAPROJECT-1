package technoCredits;

class DayExample1{
	
	void processDay(int index){
		if(index >= 1 && index<=5){
			System.out.println("WeekDay");
		}else if(index == 6 || index == 7){
			System.out.println("Weekend");
		}else{
			System.out.println("Invalid input");
		}
	}
}