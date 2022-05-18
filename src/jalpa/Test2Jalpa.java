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
package jalpa;

public class Test2Jalpa {
 int maggie = 50 ;
 int dosa = 43;
 int oilPackets = 39 ;
 int panipuri = 43 ;
 int masala = 73 ;
 	void shopping(int maggieQ, int dosaQ, int pouchesQ, int panipuriQ, int masalaQ){
	 if (maggieQ>maggie) {
		  maggie = 50 ;
		  System.out.println("Maggie Running Out Of Stock");
	 }
	else
		maggie = maggie - maggieQ ;
	 	 if (dosaQ>dosa) {
	 		dosa = 43;
	 		System.out.println("Dosa Running Out Of Stock");
	 	 }
	 	 else
	 		dosa = dosa - dosaQ ;
	 	 if (pouchesQ>oilPackets) {
	 		 oilPackets = 39 ;
	 	 	System.out.println("Oil Packets Running Out Of Stock");
	 	 }
	 	 else
	 		 oilPackets = oilPackets - pouchesQ ;
	 	 if (panipuriQ>panipuri) {
	 		panipuri = 43 ;
	 		 System.out.println("Panipuri Running Out Of Stock");
	 	 }
	 	 else 
	 		 panipuri = panipuri - panipuriQ;
	 	 if (masalaQ>masala) {
	 		 masala = 73 ;
		 System.out.println("Masala Running Out Of Stock");
	 	 }
		 else
			 masala = masala - masalaQ ;
	 	 System.out.println("----------------------");
 	}
 	void outOfStock () {
			System.out.println("Out Of Stock Products");
			if (maggie == 0)
				System.out.println("Maggie");
			if (dosa == 0)
	 			System.out.println("Dosa");
			if (oilPackets == 0)
	 			System.out.println("Oil Packets");
			if (panipuri == 0)
	 			System.out.println("Panipuri");
	 		if (masala == 0)
		 		System.out.println("Masala");
		 	 System.out.println("----------------------");
	 }
 	void availableStock() {
 		System.out.println("Available Products");
 		if (maggie > 0)
 			System.out.println(maggie + " Maggie");
 		if (dosa > 0)
			System.out.println(dosa + " Dosa");
 		if (oilPackets > 0)
			System.out.println(oilPackets + " oil Packets");
 		if (panipuri > 0)
			System.out.println(panipuri + " Panipuri");
		if (masala > 0)
			System.out.println(masala + " Masala");
 	}
 	public static void main(String[] args) {
		Test2Jalpa test2jalpa = new Test2Jalpa ();
		test2jalpa.shopping (55,15,39,20,19);
		test2jalpa.outOfStock ();
		test2jalpa.availableStock ();
	}
}