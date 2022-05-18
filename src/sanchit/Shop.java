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
}*/

package sanchit;

public class Shop {
	
	int maggieQ = 50;
	int dosaQ = 43;
	int pouchesQ = 39;
	int panipuriQ = 43;
	int masalaQ = 73;
	
	void shoping(int cusMaggieQ, int cusDosaQ, int cusPouchesQ, int cusPanipuriQ, int cusMasalaQ) {
		if(cusMaggieQ <= maggieQ) {
			maggieQ = maggieQ - cusMaggieQ;
			System.out.println("Updated stock- Maggie= "+maggieQ);
		}else if(cusMaggieQ > maggieQ){
			System.out.println("Only "+maggieQ+" stocks of maggie was avalable. Now, Maggie running out of stock");
			maggieQ = 0;
		}
		
		if(cusDosaQ <= dosaQ) {
			dosaQ = dosaQ - cusDosaQ;
			System.out.println("Updated stock- Dosa= "+dosaQ);
		}else if(cusDosaQ > dosaQ){
			System.out.println("Only "+dosaQ+" stocks of dosa was avalable. Now, Dose running out of stock");
			dosaQ = 0;
		}
		
		if(cusPouchesQ <= pouchesQ) {
			pouchesQ = pouchesQ - cusPouchesQ;
			System.out.println("Updated stock- Pouches= "+pouchesQ);
		}else if(cusPanipuriQ > pouchesQ){
			System.out.println("Only "+pouchesQ+" stocks of pouches was avalable. Now, Pouches running out of stock");
			pouchesQ = 0;
		}
		
		if(cusPanipuriQ <= panipuriQ) {
			panipuriQ = panipuriQ - cusPanipuriQ;
			System.out.println("Updated stock- Panipuri= "+panipuriQ);
		}else if(cusPanipuriQ > panipuriQ){
			System.out.println("Only "+panipuriQ+" stocks of panipuri was avalable. Now, Panipuri running out of stock");
			panipuriQ = 0;
		}
		
		if(cusMasalaQ <= masalaQ) {
			masalaQ = masalaQ - cusMasalaQ;
			System.out.println("Updated stock- Masala= "+masalaQ);
		}else if(cusMasalaQ > masalaQ){
			System.out.println("Only "+masalaQ+" stocks of masala was avalable. Now, Masala running out of stock");
			masalaQ = 0;
		}
	}
	
	void itemsOutOfStock() {
		System.out.println("******************************************");
		System.out.println("Items out of stocks:");
		if(maggieQ<=0)
			System.out.println("Maggie");
		if(dosaQ<=0)
			System.out.println("Dosa");
		if(pouchesQ<=0)
			System.out.println("Pouches");
		if(panipuriQ<=0)
			System.out.println("Panipuri");
		if(masalaQ<=0)
			System.out.println("Masala");
	}
	
	void itemsAvailableInStock() {
		System.out.println("******************************************");
		System.out.println("Items available in stocks:");
		if(maggieQ > 0)
			System.out.println("Maggie = "+maggieQ);
		if(dosaQ > 0)
			System.out.println("Dosa = "+dosaQ);
		if(pouchesQ > 0)
			System.out.println("Pouches = "+pouchesQ);
		if(panipuriQ > 0)
			System.out.println("Panipuri = "+panipuriQ);
		if(masalaQ > 0)
			System.out.println("Masala = "+masalaQ);
	}
	
	public static void main(String[] args) {
		Shop shop = new Shop();
		shop.shoping(40, 50, 30, 17, 80);
		shop.itemsOutOfStock();
		shop.itemsAvailableInStock();
	}
}
