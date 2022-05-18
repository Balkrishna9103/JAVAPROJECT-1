package dipali;
class divisible{
	void divisiblebyfive(int startindex,int endindex)
	{
		System.out.println("Divisible by five numbers are: ");
         for (int num = startindex;num<=endindex; num++){
			 if (num%5==0){
                 System.out.println(num);
			 }
		 }
	} 	 
    void divisiblebyfiveandThree(int startindex,int endindex)
    { 
	    System.out.println("Divisible by five & Three numbers are:");
         for (int num=startindex;num<=endindex;num++){
            if (num%5==0 && num%3==0){
                 System.out.println(num);
			}
		 }
	} 
				 
     void sumofnos(int startindex,int endindex){
		 int sum = 0;
         for(int num=startindex; num<=endindex; num++){
             sum=sum+num;
		 }
	     System.out.println("sum is: " +sum);
	 } 
     void sumofevenoddnos(int startindex, int endindex){
         int evennum=0, oddnum=0, difference= 0;
         for(int num=startindex; num<=endindex; num++){
            if(num%2==0){
            evennum=evennum+num;
			}
		  else{
			  oddnum=oddnum+num;
		  }  
         }
		 System.out.println("difference between sum of even and odd numbers are:" + (evennum-oddnum));

     }
     public static void main(String[] args){
     divisible div=new divisible();
     div.divisiblebyfive(10,50);
     div.divisiblebyfiveandThree(10,45);
     div.sumofnos(1,9);
     div.sumofevenoddnos(12,21);
}
}

