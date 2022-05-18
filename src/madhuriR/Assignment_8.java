package madhuriR;

public class Assignment_8 {
	//float simple_inr,celsius;
	
	void simpleIntrest(float principleAmt,int rate,int time) {
		float simple_inr=0.0f;
		simple_inr = (principleAmt*rate*time)/100;
		System.out.println(simple_inr);
			
	}
	void calTemp(float fahrenheit) {
		float celsius=0.0f;
		celsius = (fahrenheit-32)*5/9;
		System.out.println(celsius);
		
	}
//	void display() {
//		System.out.println(simple_inr);
//		System.out.println(celsius);
//	}
	public static void main(String[] args) {
		Assignment_8 a = new Assignment_8();
		a.simpleIntrest(150, 5, 4);
		a.calTemp(120);
		//a.display();
		
	}

}
