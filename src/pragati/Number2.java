package pragati;

class Number2{
	void Divnum1(int startindex, int endindex){
		int count=0;
		for(int index=startindex; index<=endindex; index++){
			if(index%7==0 || index%13==0)
			{
				if(index%7==0)
					System.out.println(index+" is divisible by 7");
				else
				    System.out.println(index+" is divisible by 13");
				    count++;
			}
			if(count==5){
			    break;
			}
		}
	}
	void revoddnum(int startindex, int endindex){
		int count=0;
		for(int index=endindex; index>=startindex; index--){
			if(index%2!=0){
				System.out.println("output: "+index);
			    count++;
			}
			if(count==3){
				break;
			}
		}
	}
	void displaysum(int startindex, int endindex){
		int sum=0;
		for(int index=startindex; index<=endindex; index++){
			sum=sum+index;
		}
		System.out.println("sum of all index "+sum);
			
	}
	void countnumDivBy7and13(int startindex, int endindex){
		int count=0;
		for(int index=startindex; index<=endindex; index++){
			if(index%7==0 || index%13==0){
				count++;
			}	
		}
		System.out.println("divisible by 7 0r divisible 13, count is: "+count);
	}
	
	public static void main(String[] args){
	    Number2 number2 = new Number2();
	    number2.Divnum1(5,40);
	    number2.revoddnum(10,20);
	    number2.displaysum(1,5);
	    number2.countnumDivBy7and13(5,40);
	}
}