package technoCredits.basic;

public class Employee {
	int num = 100;
	
	void processData(String name) {
		if(name.length() > 5)
			System.out.println("Techno");
		else
			System.out.println("Credits");
	}
}
