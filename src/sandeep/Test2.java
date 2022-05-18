package sandeep;

public class Test2 {
	int maggieQ = 50;
	int dosaQ = 43;
	int pouchesQ = 39;
	int panipuriQ = 43;
	int masalaQ = 73;

	void shopping(int reqMaggie, int reqDosa, int reqPouches, int reqPanipuri, int reqMasala) {
		 if(reqMaggie <= maggieQ) {
			maggieQ = maggieQ - reqMaggie;
			System.out.println("Packets of Maggie sold: " + reqMaggie);
			if(maggieQ <= 3)
				System.out.println("Maggie is running out of stock, only " + maggieQ + " packets left");
		}
		 else
			 System.out.println("Maggie is out of stock");
		 if(reqDosa <= dosaQ) {
			 dosaQ = dosaQ - reqDosa;
				System.out.println("Packets of Dosa Sold: " + reqDosa);
				if(dosaQ <= 3)
					System.out.println("Dosa is running out of stock, only " + dosaQ +" packets left");
		 }
		 else
			 System.out.println("Dosa is out of stock");
		 if(reqPouches <= pouchesQ) {
			 pouchesQ = pouchesQ - reqPouches;
			 System.out.println("Packets of Pouches Sold: " + reqPouches);
				if(pouchesQ <= 3)
					System.out.println("Pouches are running out of stock, only "+pouchesQ+" left");
		 }
		 else
			 System.out.println("Pouches are out of stock");
		 if(reqPanipuri <= panipuriQ) {
			 panipuriQ = panipuriQ - reqPanipuri;
			 System.out.println("Packets of Panipuri Sold: " + reqPanipuri);
				if(panipuriQ <= 3)
					System.out.println("Panipuri is running out of stock, only "+panipuriQ+" packets left");
		 }
		 else
			 System.out.println("Panipuri is out of stock");
		 if(reqMasala <= masalaQ) {
			 masalaQ = masalaQ - reqMasala;
			 System.out.println("Packets of Masala Sold: " + reqMasala);
				if(masalaQ <= 3)
					System.out.println("Masala is running out of stock, only "+masalaQ+" packets left");
		 }
		 else
			 System.out.println("Masala is out of stock");
	}

	void outOfStock() {
		if(maggieQ == 0)
			System.out.println("Maggie is Out of Stock");
		if(dosaQ == 0)
			System.out.println("Dosa is Out of Stock");
		if(pouchesQ == 0)
			System.out.println("Pouches are Out of Stock");
		if(panipuriQ == 0)
			System.out.println("Panipuri is Out of Stock");
		if(masalaQ == 0)
			System.out.println("Masala is Out of Stock");
	}

	void availableStock() {
		if(maggieQ >= 1)
			System.out.println("Available stock for Maggie is: " +maggieQ);
		if(dosaQ >= 1)
			System.out.println("Available stock for Dosa is: " +dosaQ);
		if(pouchesQ >= 1)
			System.out.println("Available stock for Pouches is: " +pouchesQ);
		if(panipuriQ >= 1)
			System.out.println("Available stock for Panipuri is: " +panipuriQ);
		if(masalaQ >= 1)
			System.out.println("Available stock for Masala is: " +masalaQ);
	}

	public static void main(String[] args) {
		Test2 test2 = new Test2();
		test2.shopping(50,20,35,40,72);
		System.out.println("----------------- Out Of Stock -------------------");
		test2.outOfStock();
		System.out.println("----------------- Available In Stock -------------");
		test2.availableStock();
	}
}
