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
public class Shop {
	int maggieStock=50;
	int dosaStock=43;
	int oilPackets=39;
	int panipuriPackets=43;
	int masalaStock=73;
	//String stock;
	
	void shopping(int maggiQ,int dosaQ,int oilQ,int panipuriQ,int masalaQ)
	{
		if(maggieStock>=maggiQ)
		{
			maggieStock=maggieStock-maggiQ;
			itemInStock("Maggie",maggieStock);
		}
		else
			outOfStock("Maggie");
	
		
		if (dosaStock>=dosaQ)
		{
			dosaStock=dosaStock-dosaQ;
			itemInStock("Dosa",dosaStock);
		}
		else
		outOfStock("Dosa");
		
		if(oilPackets>=oilQ)
		{
			oilPackets=oilPackets-oilQ;
			itemInStock("Oil Packets",oilPackets);
		}
		else
		outOfStock("Oil Packets");
			
		if (panipuriPackets>=panipuriQ)
		{
			panipuriPackets=panipuriPackets-panipuriQ;
			itemInStock("Panipuri",panipuriPackets);
		}
		else
		outOfStock("Panipuri");

		if (masalaStock>=masalaQ)
		{
			masalaStock=masalaStock-masalaQ;
			itemInStock("Masala",masalaStock);
		}
		else
		outOfStock("Masala");
		
			
	}
	
	void outOfStock(String stock)
	{
		System.out.println(stock + " is out of stock");
	}
	
	void itemInStock(String stock,int count)
	{
		System.out.println("Available " +stock+ " is " +count);
	}
	
	public static void main(String[] args)
	{
		Shop shop=new Shop();
		shop.shopping(51,20,30,43,50);
	}

}
