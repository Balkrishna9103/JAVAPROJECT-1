package dnyaneshari;

class Calculator1{
      int ans;

      public static void main(String[] args){
	         Calculator1 calculator1=new Calculator1();
             calculator1.addition(100,200);
			 calculator1.subtraction(500,150);
			 calculator1.multiplication(50,3);
			 calculator1.division(240,12);
   
           }
	  
	  void addition(int n,int m){
		  //int ans;
		  ans=n+m;
		  System.out.println("Sum of "+n+ " and  "+m+" is "+ans);
	     }
	  
	   void subtraction(int n,int m){
		 // int ans;
		  ans=n-m;
		  System.out.println("subtraction of "+n+ " and  "+m+" is "+ans);
	    }
	  
	   void multiplication(int n,int m){
		  //int ans;
		  ans=n*m;
		  System.out.println("multiplication of "+n+ " and  "+m+" is "+ans);
	    }
	  
	   void division(int n,int m){
		  //int ans;
		  ans=n/m;
		  System.out.println("division of "+n+ " and  "+m+" is "+ans);
	    }


}
