//Program 2 : 
//On user define range print first 3 number which is divisible by 17 or 13. 
package pratikK;
class Div10{
	int count=0;
	int StartRange=5;
	int EndRange=40;
	void print1(){
		while(StartRange<=EndRange){
			if(StartRange%13==0){
				System.out.println(StartRange+" is divisibe by "+StartRange);	
				count++;
			}else if(StartRange%17==0){	
				System.out.println(StartRange+" is divisibe by "+StartRange);	
				count++;	
			} 	
		StartRange++;
		if(count==3){
			break;
		}
		}	
	}
	public static void main (String[] args){
	Div10 div10=new Div10();
	div10.print1();
    }
}