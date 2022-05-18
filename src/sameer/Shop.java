/*
 * Programming Test - 2

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
}
 */

package sameer;

public class Shop {
	
	int maggieStock = 50;
	int dosaStock = 43;
	int oilPouchesStock  = 39;
	int panipuriStock = 43;
	int masalasStock = 73;
	
	public static void main(String[] args)
	{
		Shop shop = new Shop();
		shop.shopping(51,43,8,17,22);
		shop.shopping(1,3,0,0,0);
		shop.outOfStock();
		shop.presentStock();
		
	}
	 void shopping(int maggieQ, int dosaQ, int pouchesQ, int  panipuriQ, int masalaQ)
	 {
		 if(maggieStock>0)
		 {
			for(int index = 1; index<= maggieQ; index++)
			{
				 if(maggieStock>0)
				 {
					 maggieStock--;		
				 }
				 else
				 {
					 System.out.println("Maggie stock is running out of stock");
					 break;
				 }	 	 
			}
		 }
		 else
		 {
			 System.out.println("Maggie stock is running out of stock");
		 }
		 
		 if(dosaStock>0)
		 {
			for(int index = 1; index<= dosaQ; index++)
			{
				 if(dosaStock>0)
				 {
					 dosaStock--;		
				 }
				 else
				 {
					 System.out.println("Dosa stock is running out of stock");
					 break;
				 }	 	 
			}
		 }
		 else
		 {
			 System.out.println("Dosa stock is running out of stock");
		 }
		 
		 if(oilPouchesStock>0)
		 {
			for(int index = 1; index<= pouchesQ; index++)
			{
				 if(oilPouchesStock>0)
				 {
					 oilPouchesStock--;		
				 }
				 else
				 {
					 System.out.println("OilPouches stock is running out of stock");
					 break;
				 }	 	 
			}
		 }
		 else
		 {
			 System.out.println("OilPouches stock is running out of stock");
		 }
		 
		 if(panipuriStock>0)
		 {
			for(int index = 1; index<= panipuriQ; index++)
			{
				 if(panipuriStock>0)
				 {
					 panipuriStock--;		
				 }
				 else
				 {
					 System.out.println("Panipuri stock is running out of stock");
					 break;
				 }	 	 
			}
		 }
		 else
		 {
			 System.out.println("Panipuri stock is running out of stock");
		 }
		 
		 if(masalasStock>0)
		 {
			for(int index = 1; index<= masalaQ; index++)
			{
				 if(masalasStock>0)
				 {
					 masalasStock--;		
				 }
				 else
				 {
					 System.out.println("Masala stock is running out of stock");
					 break;
				 }	 	 
			}
		 }
		 else
		 {
			 System.out.println("Masala stock is running out of stock");
		 }
		 System.out.println("****************************************************************");
	 }

	void outOfStock()
	{
		if(maggieStock==0)
		{
			System.out.println("Maggie stock is out of stock");
		}
		if(dosaStock==0)
		{
			System.out.println("dosaStock stock is out of stock");
		}
		if(oilPouchesStock==0)
		{
			System.out.println("oilPouches stock is out of stock");
		}
		if(panipuriStock==0)
		{
			System.out.println("panipuri stock is out of stock");
		}
		if(masalasStock==0)
		{
			System.out.println("masalas stock is out of stock");
		}
		System.out.println("****************************************************************");
	}
	
	void presentStock()
	{
		if(maggieStock!=0)
		{
			System.out.println("Present maddie stock is "+maggieStock);
		}
		if(dosaStock!=0)
		{
			System.out.println("Present dosa stock is "+dosaStock);
		}
		if(oilPouchesStock!=0)
		{
			System.out.println("Present oil pouches stock is "+oilPouchesStock);
		}
		if(panipuriStock!=0)
		{
			System.out.println("Present panipuri stock is "+panipuriStock);
		}
		if(masalasStock!=0)
		{
			System.out.println("Present masala stock is "+masalasStock);
		}
	}

}
