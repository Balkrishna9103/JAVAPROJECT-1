package dnyaneshari;

class DivisibleByFive{

        void numbers(int startwith,int endwith){
			
			for(int num=startwith; num<=endwith; num++){
			
			   if (num%5==0){
			   
			   System.out.println("Number "+num+" is dividible by 5");
			   }
			 
			 }
		
		
		
		}
		
        public static void main(String[] args){
		     DivisibleByFive divisibleByFive=new DivisibleByFive();
			 divisibleByFive.numbers(10,30);
		 
		
		
		}

}

