 /*Programming Test - 2

Create a system (Shop) which maintains each item's quantity.

a. Initial stocks of Maggie: 50 Maggie packets 
b. Initial stocks of Dosa : 43 packets 
c. Initial stocks of pouches : 39 oil packets 
d. Initial stocks of panipuri : 43 packets  
e. Initial stocks of masala’s : 73 packets.

Expectation:
1) Only one Customer came for shopping, he picked different items with different quantities, print "running out of stock" message if a particular item is sold out otherwise deduct requested quantity from total quantity. 
2) Create a method which shows only those item which is "Out of stock".
3) Create a method which shows only those item which is "Available in stock" & respective quantities.


Hint: parametrized method required for shopping.
void shopping(int maggieQ, int dosaQ, int pouchesQ, int panipuriQ, int masalaQ){
	//Logic
} */ 
package pratikK;

public class Shop {
	int maggie = 50;
	int dosa = 43;
	int oilPouches = 39;
	int paniPuri = 43;
	int masalas = 73;
	int maggie1;
	int dosa1;
	int oilPouches1;
	int paniPuri1;
	int masalas1;

	void availableInStock(int shop1, int shop2,int shop3, int shop4, int shop5) {
		if (shop1 < 50) {
			maggie1 = maggie - shop1;
			System.out.println("Maggie qantity available in stock - " + maggie1);
		} 
		if (shop2 < 43) {
			dosa1 = dosa - shop2;
			System.out.println("Dosa quantity available in stock - " + dosa1);
		} 
		if (shop3 < 39) {
			oilPouches1 = oilPouches - shop3;
			System.out.println("Oil Pouches quantity available in stock - " + oilPouches1);
		} 
		if (shop4 < 43) {
			paniPuri1 = paniPuri - shop4;
			System.out.println("PaniPuri quantity available in stock - " + paniPuri1);
		} 
		if (shop5 < 73) {
			masalas1 = masalas - shop5;
			System.out.println("Masalas quantity available in stock - " + masalas1);
		} 
		outOfStock();
	}
	void outOfStock() {
		if(maggie1==0) { 
		System.out.println("Maggie running out of stock.");
		}
		if(dosa1==0) { 
			System.out.println("Dosa running out of stock.");
			}
		if(oilPouches1==0) { 
			System.out.println("OilPouches running out of stock.");
			}
		if(paniPuri1==0) { 
			System.out.println("Panipuri running out of stock.");
			}
		if(masalas1==0) { 
			System.out.println("Masalas running out of stock.");
			}
	}
	public static void main(String[] args) {
		Shop shop = new Shop();
		shop.availableInStock(5,43,10,15,73);
	}
}
