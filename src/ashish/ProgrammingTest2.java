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
}
Start: 8:50AM - 9:11
*
*/
package ashish;

public class ProgrammingTest2 {

	int maggieStock = 50;
	int dosaStock = 43;
	int pouchesStock = 39;
	int panipuriStock = 43;
	int masalaStock = 73;

	void shopping(int maggieQ, int dosaQ, int pouchesQ, int panipuriQ, int masalaQ) {
		if (maggieStock >= maggieQ) {
			maggieStock = maggieStock - maggieQ;
		}

		if (dosaStock >= dosaQ) {
			dosaStock = dosaStock - dosaQ;
		}

		if (pouchesStock >= pouchesQ) {
			pouchesStock = pouchesStock - pouchesQ;
		}

		if (panipuriStock >= panipuriQ) {
			panipuriStock = panipuriStock - panipuriQ;
		}

		if (masalaStock >= masalaQ) {
			masalaStock = masalaStock - masalaQ;
		}

		availableInStockItems();
		outOfStockItem();
	}

	void availableInStockItems() {

		if (maggieStock > 0) {
			System.out.println("Available maggie stock is: " + maggieStock);
		}

		if (dosaStock > 0) {
			System.out.println("Available dosa stock is: " + dosaStock);
		}

		if (pouchesStock > 0) {
			System.out.println("Available oil pouches stock is: " + pouchesStock);
		}

		if (masalaStock > 0) {
			System.out.println("Available masala stock is: " + masalaStock);
		}

		if (panipuriStock > 0) {
			System.out.println("Available panipuri stock is: " + panipuriStock);
		}
	}

	void outOfStockItem() {
		if (maggieStock <= 0) {
			System.out.println("Maggie is out of stock");
		}

		if (dosaStock <= 0) {
			System.out.println("Dosa is out of stock");
		}

		if (pouchesStock <= 0) {
			System.out.println("Oil pouches are out of stock");
		}

		if (panipuriStock <= 0) {
			System.out.println("Panipuri is out of stock");
		}

		if (masalaStock <= 0) {
			System.out.println("Masala is out of stock");
		}
	}

	public static void main(String[] args) {		
		ProgrammingTest2 programmingTest2 = new ProgrammingTest2();
		programmingTest2.shopping(1, 2, 4, 43, 5);		
	}
}
