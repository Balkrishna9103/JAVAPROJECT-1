package apurva;
/*Create a system (Shop) which maintains each item's quantity.

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

public class Test2 {

	int maggie = 50;
	int dosa = 43;
	int pouches = 39;
	int panipuri = 43;
	int masala = 73;

	void shopping(int maggieQ, int dosaQ, int pouchesQ, int panipuriQ, int masalaQ) {
		if (maggie >= maggieQ)
			maggie = maggie - maggieQ;
		if (dosa >= dosaQ)
			dosa = dosa - dosaQ;
		if (pouches >= pouchesQ)
			pouches = pouches - pouchesQ;
		if (panipuri >= panipuriQ)
			panipuri = panipuri - panipuriQ;
		if (masala >= masalaQ)
			masala = masala - masalaQ;
	}

	void outOfStockItem() {
		if (maggie > 50)
			System.out.println("Maggie is out of stock");
		if (dosa > 43)
			System.out.println("Dosa is out of stock");
		if (pouches > 39)
			System.out.println("Pouches is out of stock");
		if (panipuri > 43)
			System.out.println("Panipuri is out of stock");
		if (masala >= 73)
			System.out.println("Masala is out of stock");
	}

	void itemAvailableInStock() {
		if (maggie < 50)
			System.out.println("Available stock of maggie is: " + maggie);
		if (dosa < 43)
			System.out.println("Available stock of dosa is: " + dosa);
		if (pouches < 39)
			System.out.println("Available stock ofpouches is: " + pouches);
		if (panipuri < 43)
			System.out.println("Available stock ofpanipuri is: " + panipuri);
		if (masala < 73)
			System.out.println("Available stock of masala is: " + masala);
	}

	public static void main(String[] args) {
		Test2 test2 = new Test2();
		test2.shopping(42, 13, 18, 20, 74);
		test2.outOfStockItem();
		test2.itemAvailableInStock();
	}

}
