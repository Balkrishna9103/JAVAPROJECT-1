package arpit;

class Ass8 {

	public static void main(String[] args) {
		Ass8 ass = new Ass8();
		ass.simpleIntrest(10000, 1, 10);
		ass.temp(-40);

	}

	void simpleIntrest(int p, int t, int r) {
		int i;
		i = (p * t * r) / 100;
		System.out.println("Your simple  intrest is :- " + i);

	}

	void temp(int f) {
		int c;
		c = ((f - 32) * 5) / 9;
		System.out.println("Temp in celcius is :- " + c);
	}

}