package pragati;

class Number{
	void divisibleBy5(int startindex, int endindex){
		for(int index = startindex; index<=endindex; index++){
			if(index % 5 == 0){
				System.out.println("Divisible by five "+ index);
			}
		}
	}
	void divisibleBy5and3(int startindex,int endindex){
		for(int index=startindex; index<=endindex; index++){
			if(index %  5 == 0 && index % 3 == 0){
				System.out.println("Divisible by 5 and 3: "+ index);
			}
		}
	}
	void sum(int startindex, int endindex){
		int sum=0;
		for(int index=startindex; index<=endindex; index++)
			sum = sum + index;
		System.out.println("Sum of numbers = "+ sum);
	}
	void difference(int startindex, int endindex){
		int diff=0;
		int sumofeven=0;
		int sumofodd=0;
		for(int index=startindex; index<=endindex; index++){
			if(index %2== 0){
				sumofeven = sumofeven + index;
				}
				else{
					sumofodd = sumofodd + index;
				}
				if(sumofeven > sumofodd){
					diff = sumofeven - sumofodd;
				}
				else{
					diff = sumofodd - sumofeven;
				}
		}
		System.out.println("Difference of even and odd numbers =  "+ diff);

	}
    public static void main(String[] args){
		Number number = new Number();
        number.divisibleBy5(10,30);
	    number.divisibleBy5and3(5,18);
	    number.sum(1,5);
	    number.difference(3,9);
	}
   
}