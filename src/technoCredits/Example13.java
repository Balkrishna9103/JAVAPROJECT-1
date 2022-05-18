package technoCredits;

class Example13{
	
	void display(){
		for(int num=1;num<=30;num++){
			if(num%7==0)
				System.out.println(num);
			break;
		}
		System.out.println("Techno");
	}

	void display1(){
		int count=0; //1 //2 //3
		for(int num=1;num<=30;num++){
			if(num%7==0 || count==2){
				System.out.println(num); //7 //14 //15 //21 //28
				count++;
			}
		}
		System.out.println(count);
	}
	
	void display2(){
		int count=0; 
		for(int num=30;num>=1;num--){
			if(num%7==0){
				System.out.println(num);
				break;
			}
		}
		System.out.println(count);
	}
	
	
	public static void main(String[] args){
		Example13 example13 = new Example13();
		example13.display();
	}
}