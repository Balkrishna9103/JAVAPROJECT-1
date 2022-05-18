package minu.basic;

public class College {
	int rno;
	String name;
	void display() {
		System.out.println(name + "--" +rno);
	}
	
	void processData(int studentRno) {
		if(studentRno == 1)
			name= "Maulik";
		else
			name="Krishna";
		display();
	}
	
	public static void main(String[] args) {
		College college = new College();
		college.processData(2);
	}

}
