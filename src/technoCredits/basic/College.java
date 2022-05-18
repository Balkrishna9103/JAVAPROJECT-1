package technoCredits.basic;

public class College {
	int rno;
	String name;
	
	void display() {
		System.out.println(name + "--" + rno);
	}
	
	void processData(int studentRno) {
		if(studentRno == 1)
			name = "Maulik";
		else
			name = "Krishna";
		
		display();
		//1.display();
		//2.College.display();
		//3.this.display();
		//College college = new College();
		//college.display();
	}
	
	public static void main(String[] args) {
		College college = new College();
		college.processData(2);
	}
}
