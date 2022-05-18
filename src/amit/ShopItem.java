package amit;

public class ShopItem {
	
	static int maggie = 50;
	static int dosa = 43;
	static int pouches = 39;
	static int panipuri = 43;
	static int masala = 73;

	void shopitems(int maggieQ, int dosaQ, int pouchesQ, int panipuriQ, int masalaQ) {

		System.out.println("***********Item Purchase*********");
		if (maggie==0) 
			System.out.println("Maggie is out of stock");	
		else 
			maggie = maggie-maggieQ;
		if (dosa==0)
			System.out.println("Dosa is out of stock");	
		else
			dosa = dosa-dosaQ;
		if (pouches==0)
			System.out.println("pouche is out of stock");
		else
			pouches = pouches-pouchesQ;
		if (panipuri==0)
			System.out.println("Panipuri is out of stock");				
		else
			panipuri = panipuri-panipuriQ;		
		if (masala==0)
			System.out.println("Masala is out of Stock");
		else
			masala = masala-masalaQ;


	}
		void itemOutOfStock() {
			System.out.println("*********** out of Stock********");
			if (maggie==0) 
				System.out.println("Maggie is out of stock");
			if (dosa==0)
				System.out.println("Dosa is out of stock");
			if (pouches==0)
				System.out.println("Pouche is  out of stock");		
			if (panipuri==0)
				System.out.println("panipuri is out of stock");	
			if (masala==0)
				System.out.println("Masala is out of stock");

		}

		void itemInStock() {
			System.out.println("***********Available Item*********");		
			System.out.println("Number of Maggie Packets left = " + maggie);
			System.out.println("Number of Dosa Packets left = " + dosa);
			System.out.println("Number of Pouches Packets left = " + pouches);
			System.out.println("Number of Panipuri Packets left = " + panipuri);
			System.out.println("Number of Masala Packets left = " + masala);
		}

		public static void main(String[] args) {
			ShopItem Shopitem = new ShopItem();
			System.out.println("***********1st cutomer Shop*********");
			Shopitem.shopitems(12, 18, 11, 13, 72 );
			Shopitem.itemOutOfStock();
			Shopitem.itemInStock();
			
		}
}
