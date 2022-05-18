//Program 4-On user define range count all numbers which is divisible by 7 or 13. 
package pratikK;
class Divnumbers5{
	int count=0;
	void div1(int startrange,int endrange){
		for(int num1=startrange;num1<=endrange;num1++){
			if(num1%7==0 || num1%13==0)
				{
				 count++;
				}
			}
		System.out.println("Divisible by 7 or 13, Count is : "+count);
	}
	public static void main (String[] args){
		Divnumbers5 divnumbers5=new Divnumbers5();
		divnumbers5.div1(5,40);
	}
}