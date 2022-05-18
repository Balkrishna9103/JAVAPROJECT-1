package apurva;

public class Assignment8_SITemp {

	void displaySimpleInterest(float principle, float rate, float year) {
		float simpleInterest = ((principle * rate * year) / 100);
		System.out.println("Display Simple interest for the specific period is: " + simpleInterest);
	}

	void processTempreature(float fahrenheit) {
		float celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Convert tempreature from fahrenheit to celsius: " + celsius + " degree");
	}

	public static void main(String[] args) {
		Assignment8_SITemp assignment8_SITemp = new Assignment8_SITemp();
		assignment8_SITemp.displaySimpleInterest(1295f, 18f, 3f);
		System.out.println("                                   ");
		assignment8_SITemp.processTempreature(102F);
	}
}
