/*Programming Test -2
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



package prachi;

public class TestShopping {
	int maggie= 50;
	int dosa= 43;
	int pouches=39;
	int panipuri= 43;
	int masala=73;
	void shopping(int maggieQ, int dosaQ, int pouchesQ, int panipuriQ, int masalaQ) {
		System.out.println();
		if(maggie>0 && maggie>=maggieQ) {
			maggie = maggie- maggieQ;
		}
		else if(maggie>0 && maggie<0) {
			System.out.println("Maggie stock is not available");
		}
		else{
			System.out.println("Maggie is running out of stock");
		}
		if(dosa>0 && dosa>=dosaQ) {
			dosa = dosa - dosaQ;
		}
		else if(dosa>0 && dosa<0) {
			System.out.println("Dosa stock is not available");
		}
		else{
			System.out.println("Dosa is running out of stock");
		}
		if(pouches>0 && pouches>=pouchesQ) {
			pouches = pouches - pouchesQ;
		}
		else if(pouches>0 && pouches<0) {
			System.out.println("Pouches stock is not available");
		}
		else{
			System.out.println("Pouches is running out of stock");
		}
		if(panipuri>0 && panipuri>=panipuriQ) {
			panipuri = panipuri- panipuriQ;
		}
		else if(panipuri>0 && panipuri<0) {
			System.out.println("Panipuri stock is not available");
		}
		else{
			System.out.println("Panipuri is running out of stock");
		}
		
		if(masala>0 && masala>=masalaQ) {
			masala = masala - masalaQ;
		}
		else if(masala>0 && masala<0) {
			System.out.println("Masala stock is not available");
		}
		else{
			System.out.println("Masala is running out of stock");
		}
	}
	void outOfStock() {
		System.out.println();
		if (maggie<=0) {
			System.out.println("Maggie is out of stock");
		}
		if (dosa<=0) {
			System.out.println("Dosa is out of stock");
		}
		if (pouches<=0) {
			System.out.println("Pouches are out of stock");
		}	
		if(panipuri<0) {
			System.out.println("Panipuri is out of stock");
		}
		if (masala<=0) {
			System.out.println("Masala is out of stock");
		}
		
	}
		void availableInStock() {
			System.out.println();
			if (maggie>0) {
				System.out.println("Maggie is availabe in stock");
			}
			if (dosa>0) {
				System.out.println("Dosa is availabe in stock");
			}
			if (pouches>0) {
				System.out.println("Pouches is availabe in stock");
			}
			if (panipuri>0) {
				System.out.println("Panipuri is availabe in stock");
			}
			if (masala>0) {
				System.out.println("Masala is availabe in stock");
			}
		}
		
		public static void main(String[] args) {
			TestShopping testShopping=new TestShopping();
			testShopping.availableInStock();
			testShopping.shopping(51, 49, 32, 28, 73);
			testShopping.outOfStock();
			testShopping.availableInStock();
	}
}


