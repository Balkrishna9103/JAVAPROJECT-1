/*
 * Create a system (Shop) which maintains each item's quantity.

a. Initial stocks of Maggie: 50 Maggie packets 
b. Initial stocks of Dosa : 43 packets 
c. Initial stocks of pouches : 39 oil packets 
d. Initial stocks of panipuri : 43 packets  
e. Initial stocks of masala’s : 73 packets.

Expectation:
1) Only one Customer came for shopping, he picked different items with different quantities, print "running out of stock" message if a particular item is sold out otherwise deduct requested quantity from total quantity. 
2) Create a method which shows only those item which is "Out of stock".
3) Create a method which shows only those item which is "Available in stock" & respective quantities.
 */
package minu;

public class GroceryShop {
	
	int maggieStock=50;
	int dosaStock=43;
	int oilStock=39;
	int panipuriStock=43;
	int masalaStock=73;
	
	void shopping(int maggieQ, int dosaQ, int oilQ, int panipuriQ, int masalaQ) {
		maggieStock = maggieStock - makePurchase(maggieStock, maggieQ, "Maggie");
		dosaStock = dosaStock - makePurchase(dosaStock, dosaQ, "Dosa");
		oilStock = oilStock - makePurchase(oilStock, oilQ, "Oil");
		panipuriStock = panipuriStock - makePurchase(panipuriStock, panipuriQ, "Panipuri");
		masalaStock = masalaStock - makePurchase(masalaStock, masalaQ, "Masala");
	}
	
	int  makePurchase(int stock,int buyQuantity,String itemName) {
		if (buyQuantity <= stock) {
			System.out.println(itemName + " purchased quantity: " + buyQuantity);
			return buyQuantity;
		}
		else {
			System.out.println(itemName + " is running out of stock!");
			return 0;
		}
	}
	
	void outOfStockItems() {
		if(maggieStock <= 0)
			System.out.println("Maggie is out of stock." );
		if(dosaStock <= 0)
			System.out.println("dosa is out of stock.");
		if(oilStock <=0)
			System.out.println("Oilis out of stock.");
		if(panipuriStock <= 0)
			System.out.println("Panipuri is out of stock.");
		if(masalaStock <=0)
			System.out.println("Masala is out of stock.");
	}
	
	void availableItems() {
		if(maggieStock > 0)
			System.out.println("Available maggie stock is: " + maggieStock);
		if(dosaStock > 0)
			System.out.println("Available dosa stock is: " + dosaStock);
		if(oilStock > 0)
			System.out.println("Available oil stock is: " + oilStock);
		if(panipuriStock > 0)
			System.out.println("Available panipuri stock is: " + panipuriStock);
		if(masalaStock > 0)
			System.out.println("Available masala stock is: " + masalaStock);
	}

	public static void main(String[] args) {
		GroceryShop groceryShop = new GroceryShop();
		groceryShop.shopping(50,55,12,25,11);
		groceryShop.availableItems();
		groceryShop.outOfStockItems();
		
	}

}
