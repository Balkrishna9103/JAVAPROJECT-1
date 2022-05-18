package dnyaneshari;

public class Shop {

		int maggieQ=50;
		int dosaQ=43;
		int pouchesQ=39;
		int panipuriQ=43;
		int masalaQ=73;
		
				
		void shopping(int maggieQ1, int dosaQ1, int pouchesQ1, int panipuriQ1, int masalaQ1){
			//int availableQty;
			maggieQ=maggieQ-maggieQ1;
			if(maggieQ>0){
				System.out.println("maggie available in stock with "+maggieQ);
			}else{
				System.out.println("maggie Running out of stock");
			}	
			//maggieQ=availableQty;
			//System.out.println("Available Qty of Maggie is "+maggieQ);
		   
			//int availabledosaQ;
			dosaQ=dosaQ-dosaQ1;
			if(dosaQ>0){
				System.out.println("dosa available in stock with "+dosaQ);
			}else{
				System.out.println("dosa Running out of stock");
			}	
			//dosaQ=availabledosaQ;
			//System.out.println("Available Qty of dosa is "+dosaQ);
			
			//int availablepouchesQ;
			pouchesQ=pouchesQ-pouchesQ1;
			if(0<pouchesQ){
				System.out.println("pouch available in stock with "+pouchesQ);
			}else{
				System.out.println("pouch Running out of stock");
			}	
			//pouchesQ=availablepouchesQ;
			//System.out.println("Available Qty of dosa is "+pouchesQ);
			
			//int availablepanipuriQ;
			panipuriQ=panipuriQ-panipuriQ1;
			if(panipuriQ>0){
				System.out.println("panipuri available in stock with "+panipuriQ);
			}else{
				System.out.println("panipuri Running out of stock");
			}	
			//panipuriQ=availablepanipuriQ;
			//System.out.println("Available Qty of panipuri is "+panipuriQ1);
			
			//int availablemasalaQ;
			masalaQ=masalaQ-masalaQ1;
			if(0<masalaQ){
				System.out.println("masala available in stock with "+masalaQ);
			}else{
				System.out.println("masala Running out of stock");
			}	
			//masalaQ=availablemasalaQ;
			//System.out.println("Available Qty of masala is "+masalaQ);
		   
System.out.println("*********************");		
	}	
	    void availableItem() {
	          if(maggieQ>0)
	        	  System.out.println("Maggie is in stock with Qty "+maggieQ);
	          if(dosaQ>0)
	        	  System.out.println("dosa is in stock with Qty" +dosaQ);
	          if(pouchesQ>0)
	        	  System.out.println("Pouch is in stock with Qty "+pouchesQ);
	          if(panipuriQ>0)
	        	  System.out.println("panipuri is in stock with Qty "+panipuriQ);
	          if(masalaQ>0)
	        	  System.out.println("masala is in stock with Qty "+masalaQ);
	          
	          System.out.println("*********************");	
	          }
	       
	
	    void outOfStock() {
	    	 if(maggieQ<=0)
	    		 System.out.println("Maggie Running out of Stock");
	    	 if(dosaQ<=0)
	    		 System.out.println("dosa Running out of Stock");
	    	 if(pouchesQ<=0)
	    		 System.out.println("pouch Running out of Stock");
	    	 if(panipuriQ<=0)
	    		 System.out.println("panipuri Running out of Stock");
	    	 if(masalaQ<=0)
	    		 System.out.println("masala Running out of Stock");
	    	 System.out.println("*********************");	    	 	
	    }
	 
		
	
	
	public static void main(String[] args){
		
		Shop shop = new Shop();
		shop.shopping(45,40,19,43,32);
		shop.availableItem();
		shop.outOfStock();
		
		shop.shopping(5,0,12,0,0);
	}
	

}
