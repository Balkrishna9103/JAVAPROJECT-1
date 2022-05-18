package vrinda;

public class Assignment8_Vrinda {

	void simpleInterest(float principal,float rate,float time){
		float simpleinterest; 
		simpleinterest = (principal*rate*time)/100;
		System.out.println("Simple Interest is: " +simpleinterest);
	}

void fahrenheitTocelsius(float fahrenheit){
	  float celsius;   
      celsius  = ((fahrenheit-32)*5)/9;  
      System.out.println("Temperature in celsius is: "+celsius);  
	  }
	  
	  public static void main(String[] args)
	  {
		Assignment8_Vrinda assignment=new Assignment8_Vrinda();
		   assignment.simpleInterest(2000,12,3);
		   assignment.fahrenheitTocelsius(42);
		}
}
	

