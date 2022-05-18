package nilofar;
/*Create a system (Shop) which maintains each item's quantity.

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

	int totalMaggie = 50;
	int totalDosaPackets = 43;
	int totalOilPouches = 39;
	int totalPanipuriPackets = 43;
	int totalMasalaPackets = 73;

	void customerPurchase(int maggie, int dosa, int oil, int panipuri, int masala) {
		if (totalMaggie == 0) {
			System.out.println("Maggie is out of stock");
		} else {
			totalMaggie = totalMaggie - maggie;
		}
		if (totalDosaPackets == 0) {
			System.out.println("Dosa is out of stock");
		} else {
			totalDosaPackets = totalDosaPackets - dosa;
		}
		if (totalOilPouches == 0) {
			System.out.println("Oil is out of stock");
		} else {
			totalOilPouches = totalOilPouches - oil;
		}
		if (totalPanipuriPackets == 0) {
			System.out.println("Panipuri is out of stock");
		} else {
			totalPanipuriPackets = totalPanipuriPackets - panipuri;
		}
		if (totalMasalaPackets == 0) {
			System.out.println("Masala is out of stock");
		} else {
			totalMasalaPackets = totalMasalaPackets - masala;
		}
	}

	void displayOutOfStockItems() {
		if (totalMaggie <= 0) {
			System.out.println("Maggie is out of stock");
		}
		if (totalDosaPackets <= 0) {
			System.out.println("Dosa is out of stock");
		}
		if (totalOilPouches <= 0) {
			System.out.println("Oil is out of stock");
		}
		if (totalPanipuriPackets <= 0) {
			System.out.println("panipuri is out of stock");
		}
		if (totalMasalaPackets <= 0) {
			System.out.println("Masala is out of stock");
		}
		System.out.println();

	}

	void displayAvailableStock() {
		if (totalMaggie > 0) {
			System.out.println("Available Maggie stock is: " + totalMaggie);
		}
		if (totalDosaPackets > 0) {
			System.out.println("Available Dosa stock is: " + totalDosaPackets);
		}
		if (totalOilPouches > 0) {
			System.out.println("Available oil stock is: " + totalOilPouches);
		}
		if (totalPanipuriPackets > 0) {
			System.out.println("Available panipuri stock is: " + totalPanipuriPackets);
		}
		if (totalMasalaPackets > 0) {
			System.out.println("Available Maggie stock is: " + totalMasalaPackets);
		}
	}

	public static void main(String[] args) {
		Test2Shop test2Shop = new Test2Shop();
		test2Shop.customerPurchase(50, 4, 5, 43, 5);
		test2Shop.displayOutOfStockItems();
		test2Shop.displayAvailableStock();
	}
}
