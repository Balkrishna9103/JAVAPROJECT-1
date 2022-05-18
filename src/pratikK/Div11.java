//Program 3 : 
//On user define range print first 2 number which is divisible by 5 and 7. 
package pratikK;
class Div11{
	int count=0;
	int StartRange=5;
	int EndRange=100;
	void print2(){
		while(StartRange<=EndRange){
			if(StartRange%5==0 && StartRange%7==0 ){
				System.out.println(StartRange);	
				count++;
			}	
		StartRange++;
		if(count==2){
			break;
		}
		}	
	}
	public static void main (String[] args){
	Div11 div11=new Div11();
	div11.print2();
    }
}