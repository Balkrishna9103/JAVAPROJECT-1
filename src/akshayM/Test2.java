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


package akshayM;

public class Test2 {

	int maggie;
	int dosa;
	int pouches;
	int panipuri;
	int masalas;
	
	void setQuantity(int maggieQ, int dosaQ, int pouchesQ, int panipuriQ, int masalaQ)
	{
		maggie = maggieQ;
		dosa = dosaQ;
		pouches = pouchesQ;
		panipuri = panipuriQ;
		masalas = masalaQ;		
	}
	
	void customer(int pickMaggie, int pickDosa, int pickPouches, int pickPanipuri, int pickMasalas)
	{
		if(maggie >= pickMaggie)
			maggie = maggie - pickMaggie;
		else
			System.out.println("Maggie running out of stock");
		
		if(dosa >= pickDosa)
			dosa = dosa - pickDosa;
		else
			System.out.println("Dosa running out of stock");
		
		if(pouches >= pickPouches)
			pouches = pouches - pickPouches;
		else
			System.out.println("pouches running out of stock");
		
		if(panipuri >= pickPanipuri)
			panipuri = panipuri - pickPanipuri;
		else
			System.out.println("panipuri is running out of stock");
		
		if(masalas >= pickMasalas)
			masalas = masalas - pickMasalas;
		else
			System.out.println("Masalas are running out of stock");
	}
	
	void outOfStock()
	{
		if(maggie == 0)
			System.out.println("Maggie is out of stock");
		if(dosa == 0)
			System.out.println("Dosa is out of stock");
		if(pouches == 0)
			System.out.println("Pouches are out of stock");
		if(panipuri == 0)
			System.out.println("Panipuri is out of stock");
		if(masalas == 0)
			System.out.println("Masalas are out of stock");
	}
	
	void availbleInStock()
	{
		if(maggie > 0)
			System.out.println("Maggie available in stock " +maggie);
		if(dosa > 0)
			System.out.println("Dosa available in stock " +dosa);
		if(pouches > 0)
			System.out.println("Pouches available in stock "+pouches);
		if(panipuri > 0)
			System.out.println("Panipuri available in stock "+panipuri);
		if(masalas > 0)
			System.out.println("Masalas available in stock "+masalas);
	}
	
	public static void main(String[] args) {
		Test2 test2 = new Test2();
		test2.setQuantity(50, 43, 39, 43, 73);
		test2.customer(40, 43, 40, 21, 50);
		test2.outOfStock();
		test2.availbleInStock();	
	}
}
