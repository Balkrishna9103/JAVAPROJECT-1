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
package pramod;

public class Test2 {
	int maggieQ = 50;
	int dosaQ = 43;
	int pouchesQ = 39;
	int panipuriQ = 43;
	int masalaQ = 73;
	
	void shop(int reqMaggie, int reqDosa, int reqPouches, int reqPanipuri, int reqMasala) {
		 if(reqMaggie <= maggieQ) {
			maggieQ=maggieQ-reqMaggie;
			System.out.println(reqMaggie +" Packets of Maggie sold");
			if(maggieQ <= 3)
				System.out.println("Maggie is running out of stock, only "+maggieQ+" left");
		}
		 else
			 System.out.println("Insufficient stock for Maggie");
		 if(reqDosa <= dosaQ) {
			 dosaQ=dosaQ-reqDosa;
				System.out.println(reqDosa +" Packets of Dosa Sold");
				if(dosaQ <= 3)
					System.out.println("Dosa is running out of stock, only "+dosaQ+" left");
		 }
		 else
			 System.out.println("Insufficient stock for Dosa");
		 if(reqPouches <= pouchesQ) {
			 pouchesQ=pouchesQ-reqPouches;
			 System.out.println(reqPouches +" Packets of Pouches Sold");
				if(pouchesQ <= 3)
					System.out.println("Pouches is running out of stock, only "+pouchesQ+" left");
		 }
		 else
			 System.out.println("Insufficient stock for Pouches");
		 if(reqPanipuri <= panipuriQ) {
			 panipuriQ=panipuriQ-reqPanipuri;
			 System.out.println(reqPanipuri +" Packets of Panipuri Sold");
				if(panipuriQ <= 3)
					System.out.println("Panipuri is running out of stock, only "+panipuriQ+" left");
		 }
		 else
			 System.out.println("Insufficient stock for Panipuri");
		 if(reqMasala <= masalaQ) {
			 masalaQ=masalaQ-reqMasala;
			 System.out.println(reqMasala +" Packets of Masala Sold");
				if(masalaQ <= 3)
					System.out.println("Masala is running out of stock, only "+masalaQ+" left");
		 }
		 else
			 System.out.println("Insufficient stock for Masala");
	}
	
	void insufficientStock() {
		if(maggieQ==0)
			System.out.println("Maggie is Out of Stock");
		if(dosaQ==0)
			System.out.println("Dosa is Out of Stock");
		if(pouchesQ==0)
			System.out.println("Pouches are Out of Stock");
		if(panipuriQ==0)
			System.out.println("Panipuri is Out of Stock");
		if(masalaQ==0)
			System.out.println("Masala is Out of Stock");
	}
	
	void availableStock() {
		if(maggieQ>=1)
			System.out.println("Available stock for Maggie is " +maggieQ);
		if(dosaQ>=1)
			System.out.println("Available stock for Dosa is " +dosaQ);
		if(pouchesQ>=1)
			System.out.println("Available stock for Pouches is " +pouchesQ);
		if(panipuriQ>=1)
			System.out.println("Available stock for Panipuri is " +panipuriQ);
		if(masalaQ>=1)
			System.out.println("Available stock for Masala is " +masalaQ);
	}
	
	public static void main(String[] args) {
		Test2 test2 = new Test2();
		test2.shop(49,20,39,50,70);
		System.out.println("************ Insufficient Stock*************");
		test2.insufficientStock();
		System.out.println("************ Available Stock*************");
		test2.availableStock();
	}
}
