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
package omkar;

public class Test2 {
	int maggieCount=50;
	int dosaCount=43;
	int pouchesCount=39;
	int panipuriCount=43;
	int masalaCount=73;

	void shopping(int maggieQ, int dosaQ, int pouchesQ, int panipuriQ, int masalaQ) {
			if(maggieQ<=maggieCount) {
				maggieCount=maggieCount-maggieQ;
			
				if(maggieQ!=0) {System.out.println("maggie is running out of stock");}
			}
			
			if(dosaQ<=dosaCount) {				
				dosaCount=dosaCount-dosaQ;
				
				if(dosaQ!=0) {System.out.println("dosa is running out of stock");}
			}
			
			if(pouchesQ<=pouchesCount) {
				pouchesCount=pouchesCount-pouchesQ;
				
				if(pouchesQ!=0) {System.out.println("pouches is running out of stock");}
			}
			
			if(panipuriQ<=panipuriCount) {
				panipuriCount=panipuriCount-panipuriQ;
				
				if(panipuriQ!=0) {System.out.println("panipuri is running out of stock");}
			}
			
			if(masalaQ<=masalaCount) {
				masalaCount=masalaCount-masalaQ;
				
				if(masalaQ!=0) {System.out.println("Masala is running out of stock");}
				
			}
			
		}

	void outOfStock() {
		if (maggieCount<=0)
			System.out.println("Maggie is out of stock");
		if(dosaCount<=0)
			System.out.println("Dosa is out of stock");
		if(pouchesCount<=0)
			System.out.println("Pouches is out of stock");
		if(panipuriCount<=0)
			System.out.println("Panipuri is out of Stock");
		if(masalaCount<=0)
			System.out.println("Masala is out of Stock");		
	}
	
	void availableStock() {
		if (maggieCount>0 && maggieCount<=50)
			System.out.println("Maggie is in stock and quantity is " +maggieCount);
		if(dosaCount>0 && dosaCount <=43)
			System.out.println("Dosa is in stock and quantity is "+dosaCount);
		if(pouchesCount>0 && pouchesCount <=39)
			System.out.println("Pouches is in stock and quantity is "+pouchesCount);
		if(panipuriCount>0 && panipuriCount<=43)
			System.out.println("Panipuri is in Stock and quantity is "+panipuriCount);
		if(masalaCount>0 && masalaCount<=73)
			System.out.println("Masala is in Stock and quantity is " +masalaCount);
		
	}

	public static void main(String[] args) {
		Test2 test2=new Test2();
		test2.shopping(50, 10, 39, 0, 50);
		test2.outOfStock();
		test2.availableStock();
	}
}
