package pratikK;
class Divnumbers5{
	int count=1;
	void div1(int startrange,int endrange){
		for(int num1=startrange;num1<=endrange;num1++){
			if(num1%7==0 || num1%13==0){
				if(count<=5){
					System.out.println(num1+"is divisible by "+num1);
			        count++;
				}
			}
		}
	}
	public static void main (String[] args){
			Divnumbers5 divnumbers5=new Divnumbers5();
			divnumbers5.div1(5,40);
	}
}