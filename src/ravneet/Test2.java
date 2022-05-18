/*
 * Programming Test - 2

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

package ravneet;

public class Test2 {

	static int maggie = 50, dosa = 43, pouches = 39, panipuri = 43, masalas = 73;

	void shopping(int maggieQ, int dosaQ, int pouchesQ, int panipuriQ, int masalaQ) {
		outOfStock(maggieQ, dosaQ, pouchesQ, panipuriQ, masalaQ);
		availableInstock(maggieQ, dosaQ, pouchesQ, panipuriQ, masalaQ);
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("You order is getting Proceeded");
		if (maggie <= maggieQ || dosa <= dosaQ || pouches <= pouchesQ || pouches <= pouchesQ || masalas <= masalaQ) {
			if (maggieQ <= maggie) {
				maggie = maggie - maggieQ;
				System.out.println("Maggis are Purchased :" + maggieQ);
			}
			if (dosaQ <= dosa) {
				dosa = dosa - pouchesQ;
				System.out.println("Dosa are Purchased :" + dosaQ);
			}
			if (pouchesQ <= pouches) {
				pouches = pouches - pouchesQ;
				System.out.println("Oil Pouches are Purchased :" + pouchesQ);
			}
			if (panipuriQ <= panipuri) {
				panipuri = panipuri - panipuriQ;
				System.out.println("Panipuris are Purchased :" + panipuriQ);
			}
			if (masalaQ <= masalas) {
				masalas = masalas - masalaQ;
				System.out.println("Masalas are Purchased :" + masalaQ);
			}
		}
	}

	void outOfStock(int maggieQ, int dosaQ, int pouchesQ, int panipuriQ, int masalaQ) {
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("Out of Stock Items are  : ");
		if (maggie < maggieQ || dosa < dosaQ || pouches < pouchesQ || pouches < pouchesQ || masalas < masalaQ) {
			if (maggie < maggieQ) {
				System.out.println("Maggie is out of Stock");
			}  if (dosa < dosaQ) {
				System.out.println("dosa is out of Stock");
			}  if (pouches < pouchesQ) {
				System.out.println("Oil Pouches is out of Stock");
			}  if (panipuri < panipuriQ) {
				System.out.println("Panipuri is out of Stock");
			}  if (masalas < masalaQ) {
				System.out.println("Masala is out of Stock");
			}
		}
	}

	void availableInstock(int maggieQ, int dosaQ, int pouchesQ, int panipuriQ, int masalaQ) {
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("Available Items are  : ");
		if (maggie <= maggieQ || dosa <= dosaQ || pouches <= pouchesQ || pouches <= pouchesQ || masalas <= masalaQ) {
			if (maggieQ <= maggie)
				System.out.println("Maggi Packects are Available to Buy with Quantity :"+maggie);
			if (dosaQ <= dosa)
				System.out.println("Dosas are Available to Buy with Quantity :"+dosa);
			if (pouchesQ <= pouches)
				System.out.println("oil Pouches are Available to Buy with Quantity :"+pouches);
			if (panipuriQ <= panipuri)
				System.out.println("Panipurs are Available to Buy with Quantity :"+panipuri);
			if (masalaQ <= masalas)
				System.out.println("Masalas are Available to Buy with Quantity :"+masalas);
		}
	}

	public static void main(String[] args) {
		Test2 test2 = new Test2();
		test2.shopping(50, 60, 60, 40, 50);

	}

}
