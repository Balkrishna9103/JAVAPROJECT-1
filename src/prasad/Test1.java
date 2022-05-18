package prasad;

public class Test1 {

		void method(int startRange, int endRange) {
			for(int index=startRange; index<=endRange; index++) {
				if(index%3 == 0 && index%5 == 0) {
					System.out.println(index + " The number is divisible by 3 and 5");
				}
				else if(index%3 == 0) {
					System.out.println(index + " The number is divisible by 3");
				}
				else if(index%5 == 0) {
					System.out.println(index + " The number is divisible by 5");
				}
			}
		}
		
		public static void main(String[] args) {
			Test1 test1 = new Test1();
			test1.method(1, 100);
		}
}
