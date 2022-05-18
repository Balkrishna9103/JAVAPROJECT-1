package dipali;

class Test1 {
	
	void display(int startR, int endR) {
		for(int index=startR;index<=endR;index++) {
			if(index%3==0) {
				System.out.println(index +"  is div by 3");
			}
			if(index%5==0) {
				System.out.println(index+ "  is div by 5");
			}
			if(index%3==0 && index%5==0) {
				System.out.println(index+ "  is div by 3 & 5");
			}			
		}		
	}

	public static void main(String[] args) {
		Test1 test1= new Test1();
		test1.display(1,1000);

	}

}

