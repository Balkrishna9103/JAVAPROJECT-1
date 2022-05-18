package alka;

public class Shop {
   static int maggieQ=50;
   static int dosaQ= 43;
   static int pouchesQ=39;
   static int panipuriQ=43;
   static int masalaQ=73;
	void shopping(int ordmaggiQ , int orddosaQ, int ordpouchesQ, int  ordpanipuriQ, int ordmasalaQ) 
	{
		if(maggieQ>=ordmaggiQ) 
		{
			System.out.println("Final maggi Count "+ (maggieQ-ordmaggiQ));
		}
		else
		{
			System.out.println("out of stock");
		}
		if(dosaQ>=orddosaQ)
		{
			System.out.println("Final dosa count "+ (dosaQ-orddosaQ));
		}
		else
		{
			System.out.println("out of stock");
		}
		
		
		
		if(pouchesQ>=ordpouchesQ)
		{
			System.out.println("Final pouches count "+ (pouchesQ-ordpouchesQ));
		}
		else
		{
			System.out.println("out of stock");
		}
		
		if(panipuriQ>=ordpanipuriQ)
		{
			System.out.println("Final panipuri count"+ (panipuriQ-ordpanipuriQ));
		}
		else
		{
			System.out.println("out of stock");
		}
		
		if(masalaQ>=ordmasalaQ)
		{
			System.out.println("Final masala count"+ (masalaQ-ordmasalaQ));
		}
		else
		{
			System.out.println("out of stock");
		}
		
		
		
	}
	void availableInShop()
	{
		maggieQ=maggieQ-10;
		dosaQ=dosaQ-20;
		panipuriQ=panipuriQ-20;
		masalaQ=masalaQ-50;
		System.out.println("Items Available : maggi:"+ maggieQ +" dosa :" +dosaQ +  " panipuri  :"+panipuriQ+" masala  :"+masalaQ );
		
	}
	
	void outOfStock()
	{
		
		pouchesQ=pouchesQ-39;
		System. out.println("Items which are out of stock :pouches "+pouchesQ);
	}
	
	public static void main(String[] args) 
	{
		Shop shop=new Shop();
		shop. availableInShop();
		shop.outOfStock();
		shop.shopping(2,5,10,40,5);
		
	}

}
