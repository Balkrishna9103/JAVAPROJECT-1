package shweta;

public class Test_2 {
	
        int maggiQ=50;
        int dosaQ=43;
        int pouchesQ=39;
        int panipuriQ=43;
        int masalaQ=73;

	void shopping( int maggieQA, int dosaQA, int pouchesQA, int panipuriQA, int masalaQA)
	{
		int availableMaggie = maggiQ - maggieQA;
		int availableDosa = dosaQ - dosaQA;
		int availablePouches = pouchesQ - pouchesQA;
		int availablePanipuri = panipuriQ - panipuriQA;
		int availableMasala = masalaQ - masalaQA;
  
		if(availableMaggie <=0 )
			System.out.println(availableMaggie +" Maggie are running out of stock");
		else
			System.out.println(availableMaggie+" Number of Maggie available in stock ");

		if(availableDosa <= 0)
			System.out.println(availableDosa +" Dosa are  running out of stock");
		else
			System.out.println(availableDosa+" Number of Dosa available in stock ");

		if(availablePouches <= 0)
			System.out.println(availablePouches +" Pouches are running out of stock");
		else
			System.out.println(availablePouches+" Number of Pouches are available in stock ");

		if(availablePanipuri <= 0)
			System.out.println(availablePanipuri+" Panipuri is running out of stock");
		else
			System.out.println(availablePanipuri+" Number of Panipuri available in stock ");

		if(availableMasala <= 0)
			System.out.println(availableMasala+" Masala is running out of stock");
		else
			System.out.println(availableMasala+ " Number of Masala available in stock  ");	
	}
	
	
	public static void main(String[] args) {

		Test_2 test2=new Test_2();
		test2.shopping(40,36,89,10,79);
	
	}
}
