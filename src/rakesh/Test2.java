/* Programming Test - 2

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


package rakesh;

public class Test2 {
	int maggieAvailableQ = 50;
	int dosaAvailableQ = 43;
	int pouchesAvailableQ = 39;
	int panipuriAvailableQ = 43;
	int masalaAvailableQ = 73;
	
	void shopping(int maggieQ, int dosaQ, int pouchesQ, int panipuriQ, int masalaQ) {	
		maggieAvailableQ = maggieAvailableQ - maggieQ;
		dosaAvailableQ = dosaAvailableQ - dosaQ;
		pouchesAvailableQ = pouchesAvailableQ - pouchesQ;
		panipuriAvailableQ = panipuriAvailableQ - panipuriQ;
		masalaAvailableQ = masalaAvailableQ - masalaQ;
		System.out.println("==>Shopping completed<==");
		outOfStock();
		availableStock();
	}
		
	void outOfStock() {
		if (maggieAvailableQ <= 0)
			System.out.println("maggie is running out of stock.");
		if (dosaAvailableQ <= 0)
			System.out.println("dosa is running out of stock.");
		if (pouchesAvailableQ <= 0)
			System.out.println("oil pouch is running out of stock.");
		if (panipuriAvailableQ <= 0)
			System.out.println("panipuri is running out of stock.");
		if (masalaAvailableQ <= 0)
			System.out.println("masala is running is out of stock.");
	}
	
	void availableStock() {
		if (maggieAvailableQ > 0)
			System.out.println("maggie is available = " + maggieAvailableQ);
		if (dosaAvailableQ > 0)
			System.out.println("dosa is available = " + dosaAvailableQ);
		if (pouchesAvailableQ > 0)
			System.out.println("oil pouch is available = " + pouchesAvailableQ );
		if (panipuriAvailableQ > 0)
			System.out.println("panipuri is availble = " + panipuriAvailableQ);
		if (masalaAvailableQ > 0)
			System.out.println("masala is available = " + masalaAvailableQ);
	}
	
	public static void main (String[] arg) {
		Test2 test2 = new Test2();
		test2.shopping(60,20,40,40,50);
	}
}
