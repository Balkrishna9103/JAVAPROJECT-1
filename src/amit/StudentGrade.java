package amit;

class StudentGrade{

	void grade(int score){
		if (score <= 100 && score>=90)
			System.out.println("grade is" + "A+");
		else if (score < 90 && score >= 80)
			System.out.println("grade is" + "A");
		else if (score < 80 && score >= 70)
			System.out.println("grade is" + "B+");
		else if (score < 70 && score >= 60)
			System.out.println("grade is" + "B");
		else if (score < 60 && score >= 50)
			System.out.println("grade is" + "C");
		else if (score >= 0 && score < 50)
			System.out.println("FAILED");
		else if (score > 100 || score < 0)
			System.out.println("INVALID VALUE");
	}
			
		public static void main(String[] args){
			StudentGrade studentgrade = new StudentGrade();
			studentgrade.grade(98);
			studentgrade.grade(92);
			studentgrade.grade(83);
			studentgrade.grade(79);
			studentgrade.grade(69);
			studentgrade.grade(58);
			studentgrade.grade(43);
			studentgrade.grade(108);
			studentgrade.grade(-98);
			
		}
		
	

}