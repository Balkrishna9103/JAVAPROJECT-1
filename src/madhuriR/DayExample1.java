package madhuriR;
class DayExample1{
	 void processDay(int dayNumber){
		if(dayNumber <=5 && dayNumber>=1){
			System.out.println("Weekdays");
		}else if (dayNumber == 6 || dayNumber == 7){
			System.out.println("Weekend");
		}else
			System.out.println("Invalid Input");
	}
	public static void main(String[] args){
		DayExample1 dayexample1 = new  DayExample1();
		dayexample1.processDay(5);
		dayexample1.processDay(6);
		dayexample1.processDay(8);
		
	}
	

}