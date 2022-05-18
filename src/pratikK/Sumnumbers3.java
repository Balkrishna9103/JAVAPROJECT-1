//Program3-Find sum of all the numbers in user define range.
package pratikK;
class Sumnumbers3{
	int Sum=0;
	void display3(int startrange3,int endrange3){
		for(int num3=startrange3;num3<=endrange3;num3++){
			Sum=Sum+num3;
		}
		System.out.println("Sum is "+Sum);
	}
	public static void main (String[] args){
			Sumnumbers3 sumnumbers3=new Sumnumbers3();
			sumnumbers3.display3(1,5);
	}
}