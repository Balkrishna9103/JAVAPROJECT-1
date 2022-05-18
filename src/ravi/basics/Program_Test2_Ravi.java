package ravi.basics;

public class Program_Test2_Ravi {

	int maggiStock = 50;
	int dosaStock = 43;
	int pouchesStock = 39;
	int panipuriStock = 43;
	int masalaStock = 73;

	void shopping(int maggieQ, int dosaQ, int pouchesQ, int panipuriQ, int masalaQ)
	{

		int remainingMaggie = maggiStock - maggieQ;
		int remainingDosa = dosaStock - dosaQ;
		int remainingPouches = pouchesStock - pouchesQ;
		int remainingPanipuri = panipuriStock - panipuriQ;
		int remainingMasala = masalaStock - masalaQ;

		if(remainingMaggie == 0)
			System.out.println("Maggie is out of stock");
		else
			System.out.println("Maggie available in stock. Quantity : "+remainingMaggie);

		if(remainingDosa == 0)
			System.out.println("Dosa is out of stock");
		else
			System.out.println("Dosa available in stock. Quantity : "+remainingDosa);

		if(remainingPouches == 0)
			System.out.println("Pouches are out of stock");
		else
			System.out.println("Pouches are available in stock. Quantity : "+remainingPouches);

		if(remainingPanipuri == 0)
			System.out.println("Panipuri is out of stock");
		else
			System.out.println("Panipuri available in stock. Quantity : "+remainingPanipuri);

		if(remainingMasala == 0)
			System.out.println("Masala is out of stock");
		else
			System.out.println("Masala available in stock. Quantity : "+remainingMasala);	
	}

	public static void main(String[] args) {

		Program_Test2_Ravi shop=new Program_Test2_Ravi();
		shop.shopping(50,41,30,42,73);

	}
}