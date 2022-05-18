package shweta;

class Test1{

    void Number(int startR,int endR){
		while(startR<=endR){
			
			if(startR %3==0 && startR %5==0){
				System.out.println(startR+" is divisible by 3&5");
			}
			else if(startR %3==0){
				System.out.println(startR+" is divisible by 3");
			}else if(startR %5==0){
				System.out.println(startR+" is divisible by 5");
			}
			
			startR++;
		}	
    }


    public static void main(String[] args){
    Test1 test1= new Test1();
    test1.Number(1,100);
    }


}

