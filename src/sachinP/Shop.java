package sachinP;
/*
Programming Test - 2

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
void shoppingint maggieQ, int dosaQ, int pouchesQ, int panipuriQ, int masalaQ
	Logic 
}*/

class Shop{
	static int maggie =50;
	static int dosa = 43;
	static int pouches =39;
	static int panipuri = 43;
	static int masala = 73;


	void shopping(int maggiQ,int dosaQ, int pouchesQ, int panipuriQ, int masalaQ){
	
	if(maggiQ <= maggie && dosa<=dosaQ && pouches <= pouchesQ && panipuri <= panipuriQ && masala <=masalaQ){
		Shop.stockAvaialable(maggiQ,dosaQ,pouchesQ,panipuriQ,masalaQ);
			
	}else { 
		Shop.outofstock(maggiQ,dosaQ,pouchesQ,panipuriQ,masalaQ);		
	}
	}
	static void stockAvaialable(int i1,int i2,int i3,int i4,int i5) {
		System.out.println("Available in stock and current Qty" + (i1-maggie));
		System.out.println("Available in stock and current Qty" + (i2-dosa));
		System.out.println("Available in stock and current Qty" + (i3-pouches));
		System.out.println("Available in stock and current Qty" + (i4-panipuri));
		System.out.println("Available in stock and current Qty" + (i5-masala));
	}
	static void outofstock(int i1,int i2,int i3,int i4,int i5){
		System.out.println("Out of stock " + (i1-maggie));
		System.out.println("Out of stock " + (i2-dosa));
		System.out.println("Out of stock " + (i3-pouches));
		System.out.println("Out of stock " + (i4-panipuri));
		System.out.println("Out of stock " + (i5-masala));
	}
	
	public static void main(String a[]){
	Shop shop = new Shop();
	shop.shopping(70,10,10,10,10);
	
	}


}