package amit;

class NumberSystem1{
	
	void divby7and13(int startnum,int endnum){
		int count=0;
	for(int num=startnum; num<=endnum;num++){
		if(num%7==0 || num%13==0){
			if(num%7==0)
			System.out.println(num + "is divisible by 7");
		else 
			System.out.println(num + " is divided by 13");
			count++;
		}
		if (count==5)
			break;
	}
	
	}
	
	void oddnumber(int startnum, int endnum){
		int count=0;
		for(int num=endnum; num>=startnum;num--){
			if (num%2 != 0){
				System.out.println("odd numbers is:" + num);
				count++;
			}
			if (count==3)
				break;
		}
			
	}
	
	void addnumbers(int startnum, int endnum){
		int sum=0;
		for(int num=startnum; num<=endnum; num++){
			sum=sum+num;
		}
		System.out.println("addition of all numbers is :" + sum);
	}
	void countnumber(int startnum, int endnum){
		int count=0;
		for(int num=startnum;num<=endnum;num++){
			if (num%7==0 || num%13==0)
				count++;
			}
			System.out.println("Number count is:" + count);
		
		}
	public static void main(String[] args){
		NumberSystem1 numbersystem1= new NumberSystem1();
		numbersystem1.divby7and13(5,40);
		numbersystem1.oddnumber(10,20);
		numbersystem1.addnumbers(1,5);
		numbersystem1.countnumber(5,40);
		}
}

	
		
