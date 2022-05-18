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
package tusharB;
class Test2{
	void shopping(int maggieQ, int dosaQ, int pouchesQ, int panipuriQ, int masalaQ){
		if(maggieQ<50)
			System.out.println("maggieQ Available in stock = " + maggieQ);
		if(dosaQ<43)
			System.out.println("dosaQ Available in stock = " + dosaQ);
		if(pouchesQ<39)
			System.out.println("pouchesQ Available in stock = " + pouchesQ);
		if(panipuriQ<43)
			System.out.println("panipuriQ Available in stock = " + panipuriQ);
		if(masalaQ<73)
			System.out.println("masalaQ Available in stock = " + masalaQ);	
		System.out.println("--------------------------------------");
	}
	void outOfStock(int maggieQ, int dosaQ, int pouchesQ, int panipuriQ, int masalaQ){
		if(maggieQ>50)
			System.out.println("maggieQ out of stock = " + maggieQ);
		if(dosaQ>43)
			System.out.println("dosaQ out of stock = " + dosaQ);
		if(pouchesQ>39)
			System.out.println("pouchesQ out of stock = " + pouchesQ);
		if(panipuriQ>43)
			System.out.println("panipuriQ out of stock = " + panipuriQ);
		if(masalaQ>73)
			System.out.println("masalaQ out of stock = " + masalaQ);	
		System.out.println("--------------------------------------");
	}
	void running(int maggieQ, int dosaQ, int pouchesQ, int panipuriQ, int masalaQ){
		if(maggieQ>=50)
			System.out.println("maggieQ running Out of stock = " + maggieQ);
		if(dosaQ>=43)
			System.out.println("dosaQ running in stock = " + dosaQ);
		if(pouchesQ>=39)
			System.out.println("pouchesQ running in stock = " + pouchesQ);
		if(panipuriQ>=43)
			System.out.println("panipuriQ running in stock = " + panipuriQ);
		if(masalaQ>=73)
			System.out.println("masalaQ running in stock = " + masalaQ);
		System.out.println("--------------------------------------");		
	}
	
	public static void main(String[] args){
		Test2 test= new Test2();
		test.shopping(44,41,37,41,71);
		test.outOfStock(51,44,40,44,74);
		test.running(50,43,39,43,73);
		
	}
}