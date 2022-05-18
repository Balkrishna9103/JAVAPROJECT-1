package technoCredits;

class Example16{
	
	void m1(){
		int index=0;
		while(index<=10){
			if(index % 5 == 0){
				System.out.println(index + " techno");
				break;
			}else if(index%7 ==0){
				break;
			}
			System.out.println(index + " credits");
			System.out.println("Hi");
			index++;
			break;
		}
	}
	
	
}