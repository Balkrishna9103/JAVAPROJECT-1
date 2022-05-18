//Assignment NO=06

package balkrishna;
class AssNo6{
    void CalSum(){
	   int num=0;
	   int sum=0;
	   while(sum<=100){
		   num++;
		   sum=sum+num;
		    }
		   System.out.println("Numbers to sum 100 is ="+num);
	   
	}
    void Div(int sRange, int eRange){
	     int count=0;
		 int num=0;
		 while(sRange<=eRange){
			 num++;
			 if(num%17==0 || num%13==0){
				 System.out.println(num+"=Divisible by="+num);
				 count++;
			 }
			 if (count==3)
				 break;
		 }
	 }  
	void Print(int startR, int endR){
		int count=0;
		int num=0;
		while(startR<=endR){
			num++;
			if(num%5==0 && num%7==0){
				System.out.println(num);
				count++;
			}
			if (count==2)
				break;
		}
	}
	public static void main(String[] args){
		AssNo6 AssNo6 = new AssNo6();
			AssNo6.CalSum();
			AssNo6.Div(5,40);
			AssNo6.Print(5,100);
	}		

}

