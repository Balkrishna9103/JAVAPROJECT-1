//Program 2-Print only first 3 odd numbers in reverse order.
package pratikK;
class Oddnumbers10{
	int count=0;
	void div1(int endrange,int startrange){
		for(int num1=endrange;num1>=startrange;num1--){
			if(num1%2!=0){
				System.out.println(num1);
				count++;
				if(count==3){
					break;					
				}
			}
		}
	}
	public static void main (String[] args){
			Oddnumbers10 oddnumbers10=new Oddnumbers10();
			oddnumbers10.div1(20,10);
	}
}