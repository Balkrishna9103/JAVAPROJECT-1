/*
 	Programming Test - 2

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
}
 */

package minalH;

public class Test2 {
	
	int maggiStock = 50;
	int dosaStock = 43;
	int pouchesStock = 39;
	int panipuriStock = 43;
	int masalaStock = 73;
	
	void shopping(int maggieQ, int dosaQ, int pouchesQ, int panipuriQ, int masalaQ) {
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
		Test2 test2 = new Test2();
		test2.shopping(50,30,35,42,73);
	}
}
