package prasad;

public class Display {
	
	void interest(int p, int t, float r) {
		double ESI;
		ESI = (p * t * r ) / 100;
		System.out.println(" Expected simple interest is : " + ESI);
	}
	
	void temp(double f) {
		double C;
		C = (f-32) * 5/9;
		System.out.println("");
		System.out.println(" A conversion of Fahrenheit to Celsius is : " + C + " C");
	}
	
	public static void main(String[] args) {
		Display display = new Display();
		display.interest(50000, 15, 12.5f);
		display.temp(110);
	}

}
