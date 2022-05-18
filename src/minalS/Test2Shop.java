package minalS;

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

public class Test2Shop {
	static int totalMaggiPackets=50;
	static int totalDosaPackets=43;
	static int totalOilPouches=39;
	static int totalPanipuriPackets=43;
	static int totalMasalaPackets=73;
	
	void shopping(int maggiQ, int dosaQ, int oilQ, int panipuriQ, int masalaQ) {
		if(totalMaggiPackets>=maggiQ) {
			totalMaggiPackets=totalMaggiPackets-maggiQ;
		}else if(totalMaggiPackets<maggiQ) {
			System.out.println("Maggi packets running out of stock");
		}
		
		if(totalDosaPackets>=dosaQ) {
			totalDosaPackets=totalDosaPackets-dosaQ;
		}else if(totalDosaPackets<dosaQ) {
			System.out.println("Dosa packets running out of stock");
		}
		
		if(totalOilPouches>=oilQ) {
			totalOilPouches=totalOilPouches-oilQ;
		}else if(totalOilPouches<oilQ) {
			System.out.println("Oil pouches running out of stock");
		}
		
		if(totalPanipuriPackets>=panipuriQ) {
			totalPanipuriPackets=totalPanipuriPackets-panipuriQ;
		}else if(totalPanipuriPackets<panipuriQ) {
			System.out.println("Panipuri packets running out of stock");
		}
		
		if(totalMasalaPackets>=masalaQ) {
			totalMasalaPackets=totalMasalaPackets-masalaQ;
		}else if(totalMasalaPackets<masalaQ) {
			System.out.println("Masala packets running out of stock");
		}
	}
	
	void displayOutOfStock() {
		if(totalMaggiPackets==0) {
			System.out.println("Maggi packets are out of stock");
		}
		
		if(totalDosaPackets==0) {
			System.out.println("Dosa packets are out of stock");
		}
		
		if(totalOilPouches==0) {
			System.out.println("Oil pouches are out of stock");
		}
		
		if(totalPanipuriPackets==0) {
			System.out.println("Panipuri packets are out of stock");
		}
		
		if(totalMasalaPackets==0) {
			System.out.println("Masala packets are out of stock");
		}
	}
	
	void displayAvailableInStock() {
		if(totalMaggiPackets>0) {
			System.out.println(totalMaggiPackets+" Maggi packets are available in stock");
		}
		
		if(totalDosaPackets>0) {
			System.out.println(totalDosaPackets+" Dosa packets are available in stock");
		}
		
		if(totalOilPouches>0) {
			System.out.println(totalOilPouches+" Oil pouches are available in stock");
		}
		
		if(totalPanipuriPackets>0) {
			System.out.println(totalPanipuriPackets+" Panipuri packets are available in  stock");
		}
		
		if(totalMasalaPackets>0) {
			System.out.println(totalMasalaPackets+" Masala packets are available in stock");
		}
	}
	
	public static void main(String[] args) {
		Test2Shop test2Shop=new Test2Shop();
		test2Shop.shopping(50, 34, 39, 12, 56);
		test2Shop.displayOutOfStock();
		test2Shop.displayAvailableInStock();
		
		
	}
}
