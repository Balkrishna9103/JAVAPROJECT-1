package bhavik;

public class Shop {
	
	int maggie = 50;
	int dosa = 43;
	int pouches = 39;
	int panipuri = 43;
	int masala = 73;
	
	void shopping (int maggieQ, int dosaQ, int pouchesQ, int panipuriQ, int masalaQ) {		
		maggie = maggie - maggieQ;
		dosa = dosa - dosaQ;
		pouches = pouches - pouchesQ;
		panipuri = panipuri - panipuriQ;
		masala = masala - masalaQ;
		
		outOfStock();
		availableInStock();
		
	}
	
	void outOfStock() {
		if (maggie == 0) 
			System.out.println("Maggie out of stock");
		if (dosa == 0) 
			System.out.println("dosa out of stock");
		if (pouches == 0) 
			System.out.println("pouches out of stock");
		if (panipuri == 0) 
			System.out.println("panipuri out of stock");
		if (masala == 0) 
			System.out.println("masala out of stock");
		else {
			System.out.println(" All items are in stockS");
		}
	}
	
	void availableInStock () {
		if (maggie > 0) 
			System.out.println(maggie + " Qty Maggie available in stock");
		if (dosa > 0) 
			System.out.println(dosa + " Qty dosa available in stock");
		if (pouches > 0) 
			System.out.println(pouches + " Qty pouches available in stock");
		if (panipuri > 0) 
			System.out.println(panipuri + " Qty panipuri available in stock");
		if (masala > 0) 
			System.out.println(masala + " Qty masala available in stock");
		else {
			System.out.println(" All items are out of stock");
		}
	}
	
	public static void main(String[] args) {
		Shop shop = new Shop();
		shop.shopping(10, 20, 10, 10, 10);
	}

}
