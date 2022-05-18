package pragati;

class Example13{
	void display(){
		int count=0;
		for(int num=1; num<=30;num++){
			if(num%7==0 || count==2){
				System.out.println(num);
				count++;
			}
		}
	}
	public static void main(String[] args){
		Example13 example13 = new Example13();
		example13.display();
	}
}