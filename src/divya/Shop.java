
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
 */

package divya;

public class Shop {

	static int maggie = 50;
	static int dosa = 43;
	static int pouches = 39;
	static int panipuri = 43;
	static int masala = 73;

	void shopping(int maggieQ, int dosaQ, int pouchesQ, int panipuriQ, int masalaQ) {

		System.out.println("***********Item Purchased*********");
		if (maggie > 0 && maggie >= maggieQ)
			maggie = maggie - maggieQ;
		else if (maggie > 0 && maggie < maggieQ)
			System.out.println("Maggie is insufficient in stock");
		else
			System.out.println("Maggie is out of stock");

		if (dosa > 0 && dosa >= dosaQ)
			dosa = dosa - dosaQ;
		else if (dosa > 0 && dosa < dosaQ)

			System.out.println("Dosa is insufficient in stock");
		else
			System.out.println("Dosa is out of stock");
		if (pouches > 0 && pouches >=pouchesQ)
			pouches = pouches - pouchesQ;
		else if (pouches > 0 && pouches < pouchesQ)
			System.out.println("pouche is out of stock");
		else
			System.out.println("pouche is out of stock");
		if (panipuri > 0 && panipuri >= panipuriQ)
			panipuri = panipuri - panipuriQ;
		else if (panipuri > 0 && panipuri < panipuriQ)
			System.out.println("Panipuri is insufficient in stock");
		else
			System.out.println("Panipuri is out of stock");
		if (masala>0 && masala >= masalaQ)
			masala = masala - masalaQ;
		else if (masala>0 && masala < masalaQ)
			System.out.println("Masala is insufficient in  Stock");
		else
			System.out.println("Masala is out of Stock");

	}

	void itemOutOfStock() {
		System.out.println("***********Items out of Stock********");
		if (maggie == 0)
			System.out.println("Maggie is out of stock");
		if (dosa == 0)
			System.out.println("Dosa is out of stock");
		if (pouches == 0)
			System.out.println("Pouche is  out of stock");
		if (panipuri == 0)
			System.out.println("panipuri is out of stock");
		if (masala == 0)
			System.out.println("Masala is out of stock");

	}

	void itemInStock() {
		System.out.println("***********Item Quantity Left*********");
		System.out.println("Number of Maggie Packets left = " + maggie);
		System.out.println("Number of Dosa Packets left = " + dosa);
		System.out.println("Number of Pouches Packets left = " + pouches);
		System.out.println("Number of Panipuri Packets left = " + panipuri);
		System.out.println("Number of Masala Packets left = " + masala);
	}

	public static void main(String[] args) {
		Shop shop = new Shop();
		System.out.println("***********First Customer Purchased*********");
		shop.shopping(51, 20, 10, 12, 73);
		shop.itemOutOfStock();
		shop.itemInStock();
	}
}
