package shekhar;

public class ProgrammingTest2Shop {
	int maggieQ=50;
	int dosaQ=43;
	int oilpouchesQ=39;
	int masalaQ=43;
	int panipuriQ=73;
	void purchasedItems(int requestedMaggie,int requestedDosa,int requestedOilPouches,int requestedmasala,int requestedPanipuri ) {
		if(requestedMaggie<=maggieQ) {
			maggieQ=maggieQ-requestedMaggie;
			System.out.println("You have purchased " +requestedMaggie+ " maggie items");
			System.out.println("Maggie available in stock is : " +maggieQ);
		}else
			System.out.println("Maggie is not available.");
		if(requestedDosa<=dosaQ) {
			dosaQ=dosaQ-requestedDosa;
			System.out.println("You have purchased " +requestedDosa+ " dosa items");
			System.out.println("dosa available in stock is : " +dosaQ);
		}else
			System.out.println("dosa is not available.");
		if(requestedOilPouches<=oilpouchesQ) {
			oilpouchesQ=oilpouchesQ-requestedOilPouches;
			System.out.println("You have purchased " +requestedOilPouches+ " oil pouches");
			System.out.println("Oil pouches available in stock are : " +oilpouchesQ);
		}else
			System.out.println("oil pouches are not available.");
		if(requestedmasala<=masalaQ) {
			masalaQ=masalaQ-requestedmasala;
			System.out.println("You have purchased " +requestedmasala+ " masala items");
			System.out.println("masala available in stock is : " +masalaQ);
		}else
			System.out.println("masala is not available.");
		if(requestedPanipuri<=panipuriQ) {
			panipuriQ=panipuriQ-requestedPanipuri;
			System.out.println("You have purchased " +requestedPanipuri+ " Panipuri items");
			System.out.println("Panipuri available in stock is : " +panipuriQ);
		}else
			System.out.println("Panipuri is not available.");
	}
	void availableItems() {
		if(maggieQ>0) {
			System.out.println("Maggie is available in stock,quantity is: " +maggieQ);
		}
		if(dosaQ>0) {
			System.out.println("Dosa is available in stock,quantity is: " +dosaQ);
		}
		if(oilpouchesQ>0) {
			System.out.println("Oil pouches are available in stock,quantity is: " +oilpouchesQ);
		}
		if(masalaQ>0) {
			System.out.println("Masala is available in stock,quantity is: " +masalaQ);
		}
		if(panipuriQ>0) {
			System.out.println("Panipuri is available in stock,quantity is: " +panipuriQ);
		}
	}
	
	void outOfStockItems() {
		if(maggieQ<=0) {
			System.out.println("Maggie is out of stock");
		}
		if(dosaQ<=0) {
			System.out.println("dosa is out of stock");
		}
		if(oilpouchesQ<=0) {
			System.out.println("Oil pouches is out of stock");
		}
		if(masalaQ<=0) {
			System.out.println("Masala is out of stock");
		}
		if(panipuriQ<=0) {
			System.out.println("Panipuri is out of stock");
		}
		
	}
	public static void main(String[] args) {
		ProgrammingTest2Shop programmingtest2shop = new ProgrammingTest2Shop();
		programmingtest2shop.purchasedItems(49,20,34,38,69);
		programmingtest2shop.availableItems();
		programmingtest2shop.outOfStockItems();
	}

}
