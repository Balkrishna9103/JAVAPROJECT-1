package ashish;

class Example7{

	int num = 10;
	int temp;
	
	void m1(){
		int num = temp;
		System.out.println(num + num);
		num=1000;
		temp=num;
	}
	
	public static void main(String[] args){
		Example7 example7 = new Example7();
		example7.m1();
		example7.m1();
	}

}
