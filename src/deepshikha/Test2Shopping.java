//Programming Test - 2
//
//Create a system (Shop) which maintains each item's quantity.
//
//a. Initial stocks of Maggie: 50 Maggie packets 
//b. Initial stocks of Dosa : 43 packets 
//c. Initial stocks of pouches : 39 oil packets 
//d. Initial stocks of panipuri : 43 packets  
//e. Initial stocks of masala’s : 73 packets.
//
//Expectation:
//1) Only one Customer came for shopping, he picked different items with different quantities, 
//print "running out of stock" message if a particular item is sold out otherwise deduct requested quantity from total quantity. 
//2) Create a method which shows only those item which is "Out of stock".
//3) Create a method which shows only those item which is "Available in stock" & respective quantities.
//
//
//Hint: parametrized method required for shopping.
//void shopping(int maggieQ, int dosaQ, int pouchesQ, int panipuriQ, int masalaQ){
//	//Logic
//}

package deepshikha;

public class Test2Shopping {
	int maggie=50;
	int dosa=43;
	int pouches=39;
	int panipuri=43;
	int masala=73;
	
	void shopping(int maggieQ, int dosaQ, int pouchesQ, int panipuriQ, int masalaQ) {
		if(maggie>=maggieQ) {
			maggie=maggie-maggieQ;
		}else 
			System.out.println("Item "+ maggie +" maggie running out of stock");
		if(dosa>=dosaQ) {
			dosa=dosa-dosaQ;
		}else 
			System.out.println("Item "+ dosa +" dosa running out of stock");
		if(pouches>=pouchesQ) {
			pouches=pouches-pouchesQ;
		}else
			System.out.println("Item "+ pouches +" pouches running out of stock");
		if(panipuri>=panipuriQ) {
			panipuri=panipuri-panipuriQ;
		}else
			System.out.println("Item "+ panipuri +" panipuri running out of stock");
		if(masala>=masalaQ) {
			masala=masala-masalaQ;
		}else
			System.out.println("Item "+ masala +" masala running out of stock");
	}
	
	void outOfStock() {
		if (maggie==0)
			System.out.println(maggie +" is out of stock");
		if(dosa==0)
			System.out.println(dosa +" is out of stock");
		if(pouches==0)
			System.out.println(pouches +" is out of stock");
		if(panipuri==0)
			System.out.println(panipuri +" is out of stock");
		if(masala==0)
			System.out.println(masala +" is out of stock");
	}
	
	void availableInStock() {
		if (maggie>0)
			System.out.println(maggie+" Available in stock");
		if (dosa>0)
			System.out.println(dosa+" Available in stock");
		if (pouches>0)
			System.out.println(pouches+" Available in stock");
		if (panipuri>0)
			System.out.println(panipuri+" Available in stock");
		if (masala>0)
			System.out.println(masala+" Available in stock");
	}
	
 public static void main(String[] args) {
	Test2Shopping test2Shopping=new Test2Shopping();
	test2Shopping.shopping(51, 20, 30, 34, 81);
	test2Shopping.outOfStock();
	test2Shopping.availableInStock();
	
 }	
}
