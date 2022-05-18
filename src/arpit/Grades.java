package arpit;

class Grades {
	int mrk = 90;

	public static void main(String[] args) {

		Grades grd = new Grades();
		grd.grade();

	}

	void grade() {

		if (mrk >= 90 && mrk <= 100) {
			System.out.println("You have got A+ grade.");
		} else if (mrk >= 80 && mrk < 90) {
			System.out.println("You have got A grade.");
		} else if (mrk >= 70 && mrk < 80) {
			System.out.println("You have got B+ grade.");
		} else if (mrk >= 60 && mrk < 70) {
			System.out.println("You have got B grade.");
		} else if (mrk >= 50 && mrk < 60) {
			System.out.println("You have got C grade.");
		} else if (mrk < 50) {
			System.out.println("Sorry You have failed the exam.");
		} else {
			System.out.println("Invalid Input !!");
		}
	}
}