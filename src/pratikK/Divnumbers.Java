//Program1-1. On user define range print first 5 number which is divisible by 7 or 13
package pratikK;
class Divnumbers{
	int count=1;
	void div1(int startrange,int endrange){
		for(int num1=startrange;num1<=endrange;num1++){
			if(num1%7==0 || num1%13==0){
				if(count<=5){
					if(num1%7==0){
							System.out.println(num1+" is divisible by 7");
					}else{
						System.out.println(num1+" is divisible by 13");
					}
			        count++;
				}
			}
		}
	}
	public static void main (String[] args){
		Divnumbers divnumbers=new Divnumbers();
		divnumbers.div1(5,40);
	}
}