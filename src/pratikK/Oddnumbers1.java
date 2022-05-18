package pratikK;
class Oddumbers1{
	int count=1;
	void div1(int startrange,int endrange){
		for(int num1=endrange;num1>=startrange;num1--){
			if(num1%2==0){
				System.out.println(num1);
				//if(count<=3){
				//	System.out.println(num1);
			      //  count++;
				//}
			}
		}
	}
	public static void main (String[] args){
			Oddumbers1 oddumbers1=new Oddumbers1();
			oddumbers1.div1(20,10);
	}
}