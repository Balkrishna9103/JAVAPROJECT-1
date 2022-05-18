//Assignment No-4
package balkrishna;
class DisplaydivibleNum{
	
    void ProcessData(int startRange,int endRange){
	    for(int i=startRange;i<=endRange;i++){
			if(i%5==0){
				System.out.println("Divible number is ="+i);
			}
	    }
    }
	void ProcessData1(int startRange,int endRange){
	    for(int i=startRange;i<=endRange;i++){
            if(i%5==0 && i%3==0)
				System.out.println("Divible num 5 & 3 is ="+i);
		}
	}
	 void Sum(int startRange,int endRange){
            int sum=0;
             for(int i=startRange;i<=endRange;i++)
               sum = sum+i;
                 System.out.println("sum of number is="+sum);
	 }				 
     void differenceSumofEvenOdd(int startRange,int endRange){
		   int sumEven=0;
		   int sumOdd=0;
		    for(int i=startRange;i<=endRange;i++){
				if(i%2==0){
					sumEven = sumEven+ i;
				}
				 else {
			        sumOdd=sumOdd+i;
				 }	
			}
			System.out.println("Difference between sum of odd and Even number is="+(sumOdd-sumEven));
	    }
	 
    public static void main(String[] args){
      DisplaydivibleNum DisplaydivibleNum = new DisplaydivibleNum();
      DisplaydivibleNum.ProcessData(10,30);
	  DisplaydivibleNum.ProcessData1(10,18);
	  DisplaydivibleNum.Sum(1,5);
	  DisplaydivibleNum.differenceSumofEvenOdd(3,9);
   }
 }