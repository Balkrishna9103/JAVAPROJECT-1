//Program 2 : 
//On user define range print first 3 number which is divisible by 17 or 13. 
package pratikK;
class Div1{
	void print(int StartRange,int EndRange){
		while(StartRange%13==0 || StartRange%17==0){
			System.out.println(" is divisibe by ");	
		}
		System.out.println("error");
	}
	public static void main(String[]args){
	Div1 div1=new Div1();
	div1.print(5,40);
    }
}