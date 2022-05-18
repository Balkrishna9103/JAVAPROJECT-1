package shweta;

public class Assignment_8 {

		double simpleInterest;
		float celsius;
		
		void computeSimpleInterest(int principleAmount,int time,float rate) {
			simpleInterest=(principleAmount*time*rate)/100;
			System.out.println("The SimpleInterest is "+simpleInterest);
		}

		
		void convertTemp(float fahrenheit){
			celsius=(fahrenheit-32)*5/9;
			System.out.println("Convertion of Temperature from Fahrenheit to Celsius is "+celsius);
		}
	    public static void main(String[] args) {
		    Assignment_8 assignment8	=new Assignment_8();
		    assignment8.computeSimpleInterest(55500,3,10.35f);
		    assignment8.convertTemp(98.6f);
	    }
	}


