/* Programming Test - 2
Create a system (Shop) which maintains each item's quantity.
a. Initial stocks of Maggie: 50 Maggie packets 
b. Initial stocks of Dosa : 43 packets 
c. Initial stocks of pouches : 39 oil packets 
d. Initial stocks of panipuri : 43 packets  
e. Initial stocks of masala’s : 73 packets.
Expectation:
1) Only one Customer came for shopping, he picked different items with different quantities, 
print "running out of stock" message if a particular item is sold out 
otherwise deduct requested quantity from total quantity.
int avaibleMq=50; 
void  shopping(int mq, int dQ, int pQ, int ppQ, int mq){
	if (mq<= )
	}
2) Create a method which shows only those item which is "Out of stock".
3) Create a method which shows only those item which is "Available in stock" & respective quantities.
Hint: parametrized method required for shopping.
void shopping(int maggieQ, int dosaQ, int pouchesQ, int panipuriQ, int masalaQ){
	//Logic
 */

package trupti;

public class Test2_Trupti {
	static int availableMaggiQty=50;
	static int availableDosaQty=43;
	static int availablePouchesQty=39;
	static int availablePanipuriQty=43;
	static int availableMasalaQty=73;
	
	static void shopping(int maggiQ, int dosaQ, int pouchesQ, int panipuriQ, int masalaQ) {
		if(maggiQ>availableMaggiQty) 
			System.out.println("Maggi running out off stock\n");
		else
			availableMaggiQty=availableMaggiQty-maggiQ;
			
		if(dosaQ>availableDosaQty) 
			System.out.println("Dosa qty running out of stock\n");
		else
			availableDosaQty=availableDosaQty-dosaQ;
		
		if(pouchesQ>availablePouchesQty) 
			System.out.println("Pouches qty running out of stock\n");
		else
			availablePouchesQty=availablePouchesQty-pouchesQ;
		
		if(panipuriQ>availablePanipuriQty) 
			System.out.println("Panipuri qty running out of stock\n");
		else
			availablePanipuriQty=availablePanipuriQty-panipuriQ;
		
		if(masalaQ>availableMasalaQty) 
			System.out.println("Masala's qty running out of stock\n");
		else
			availableMasalaQty=availableMasalaQty-masalaQ;
		
		availableStock();
		outOfStock();
 }
	
     static void availableStock() {
    	System.out.println("Available Quantities : \n");
    	if(availableMaggiQty>=0)
    		System.out.println("Maggi :"+availableMaggiQty);
    	if(availableDosaQty>=0)
    		System.out.println("Dosa :"+availableDosaQty);
    	if(availablePouchesQty>=0)
    		System.out.println("Pouches :"+availablePouchesQty);
    	if(availablePanipuriQty>=0)
    		System.out.println("Panipuri :"+availablePanipuriQty);
    	if(availableMasalaQty>=0)
    		System.out.println("Masala's :"+availableMasalaQty);
		System.out.println("----------------------------------");
	}
	
	static void outOfStock() {
		System.out.println("Out of Stock : \n");
		if(availableMaggiQty==0)
			System.out.println("Maggi is out of stock");
		if(availableDosaQty==0)
			System.out.println("Dosa is out of stock");
		if(availablePouchesQty==0)
			System.out.println("Pouches is out of stock");
		if(availablePanipuriQty==0)
			System.out.println("Panipuri is out of stock");
		if(availableMasalaQty==0)
			System.out.println("Masala's is out of stock");
		System.out.println("----------------------------------");
		
	}
	
	public static void main(String[] args) {
		Test2_Trupti.shopping(15,43,3,44,43);
	}
}
