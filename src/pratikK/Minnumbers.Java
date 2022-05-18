//Program 1:
//Write a method to find out minimum required numbers to generate sum 100.(output : 14)(Use While)
package pratikK;
class Minnumbers{
	void numDisplay(){
		int Sum=0;
		int Startrange=0;
		int Count=0;
		while (Sum<=100){
			Startrange++;        
			Sum=Sum+Startrange;  
			Count++;
		}
		System.out.println(Count);
	}
	public static void main (String[] args){
		Minnumbers minnumbers=new Minnumbers();
		minnumbers.numDisplay();
	}
}