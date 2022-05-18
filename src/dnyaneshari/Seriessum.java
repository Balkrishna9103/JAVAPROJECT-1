package dnyaneshari;
class SeriesSum{
        int sum=0;
		
		void summation(int startrange,int endrange){
		
		      for(int num=startrange;num<=endrange;num++){
				     sum=sum+num;
			     }
		      System.out.println("summation of all numbers are "+sum);
		}
		
		public static void main(String[] args){
		
			   SeriesSum seriessum= new SeriesSum();
		       seriessum.summation(1,10);
		
		}




}

