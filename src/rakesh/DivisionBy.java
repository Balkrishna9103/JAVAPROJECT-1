package rakesh;
class DivisionBy {

	void getDivision() {
		System.out.println("Start");
		int sum = 0;     //init of local variable is must
		int count = 0;
		for (int index=1; index<=100; index++)  {			
			if (index%3 == 0 && index%5 == 0) {
				System.out.println(index + " is a divisible by 3 and 5 both");
				sum = sum + index;
				count = count + 1; // count +1
				//count=count++;
			}
		}
		System.out.println("There are total <<" + count + ">> numbers which are is a divisible by 3 and 5 both");		
		System.out.println("<<"+sum+">>" + " is the sum of all numbers which are is a divisible by 3 and 5 both");
		System.out.println("End");
	}

	public static void main (String[] arg) {
	DivisionBy divisionBy = new DivisionBy();
	divisionBy.getDivision();
	}
}
