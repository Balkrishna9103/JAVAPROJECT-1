package dnyaneshari;

class Difference{

            void evenodd(int sindex,int eindex ){
			      
				  int even=0;
				  int odd=0;
				     for(int i=sindex;i<=eindex;i++){
				  
				          if(i%2==0){
					  
					           even=even+i;
					           System.out.println("Number "+i+" is even number");
					  				  
				          }
					 }
			  System.out.println("****************************************");
			  
			         for(int i=sindex;i<=eindex;i++){
				  
				          if(i%2!=0){
					  
					           odd=odd+i;
					           System.out.println("Number "+i+" is odd number");
					  				  
				          }
						  
						  
						  					  
					 }
						System.out.println("Difference is "+(even-odd));
						
			        }
			
			public static void main(String[] args){
			         
					 
					 Difference difference=new Difference();
					 difference.evenodd(1,50);
			
			
			}
			

}