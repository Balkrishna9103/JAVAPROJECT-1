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

package poojaJ;

public class Test2 {
	
	int maggie=50;                                                     
	int dosa= 43 ;
	int pouches=39;
	int panipuri =43 ;
	int masala = 73 ;
	int balance;
	
	void shopping(int maggieQ, int dosaQ, int pouchesQ, int panipuriQ, int masalaQ) {
		maggie= maggie-maggieQ;
		//System.out.println(maggie);
		dosa= dosa-dosaQ;
		//System.out.println(dosa);
		pouches=pouches-pouchesQ;
		panipuri= panipuri-panipuriQ;
		masala= masala-masalaQ;
		
		if (maggie<=0)
			System.out.println("Maggie is running out of stock");
		else 
			System.out.println("Available maggie stock is: " +maggie);

		if (dosa<=0)
			System.out.println("dosa is running out of stock");
		else 
			System.out.println("Available dosa stock is: " +dosa);

		if (pouches<=0)
			System.out.println("pouches is running out of stock");
		else 
			System.out.println("Available maggie stock is: " +pouches);

		if (panipuri<=0)
			System.out.println("panipuri is running out of stock");
		else 
			System.out.println("Available maggie stock is: " +panipuri);

		if (masala<=0)
			System.out.println("masala is running out of stock");
		else 
			System.out.println("Available maggie stock is: " +masala);
		
	}
	
	
	public static void main(String[] args) {
		Test2 test2 = new Test2();
		test2.shopping(22, 44, 30, 43, 70);
	}

}
