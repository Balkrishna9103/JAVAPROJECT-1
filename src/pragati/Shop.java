package pragati;

public class Shop {
	int totalmaggieQ=50;
	int totaldosaQ=43;
	int totalpouchesQ=39;
	int totalpanipuriQ=43;
	int totalmasalaQ=73;
	
	void shopping(int maggieQ, int dosaQ, int pouchesQ, int panipuriQ, int masalaQ) {
		if(maggieQ<=50) {
		    totalmaggieQ=totalmaggieQ-maggieQ;
		    System.out.println("totalQ of maggie "+totalmaggieQ);
		} 
		else{
			System.out.println("maggie running out of stock");
		    }
	    if(dosaQ<=43){
			totaldosaQ=totaldosaQ-dosaQ;
			System.out.println("totalQ of dosaQ "+totaldosaQ);
	    }
		else{
		    System.out.println("dosa running out of stock");
		    }
		if(pouchesQ<=39){
			totalpouchesQ=totalpouchesQ-pouchesQ;
			System.out.println("totalQ of pouches "+totalpouchesQ);
		}
		else{
			System.out.println("pouches running out of stock");
			}
		if(panipuriQ<=43){
	    	totalpanipuriQ=totalpanipuriQ-panipuriQ;
			System.out.println("totalQ of panipuri "+totalpanipuriQ);
		}
		else{
			System.out.println("panipuri running out of stock");
			}
	    if(masalaQ<=73){
		   totalmasalaQ=totalmasalaQ-masalaQ;
		   System.out.println("totalQ of masala's items "+totalmasalaQ);
		}
		else{
			System.out.println("masala's running out of stock");
		    }
		
	}
	void outOfStock(){
		if(totalmaggieQ==0){
		   System.out.println("maggie is out of stock");
		}
		if(totaldosaQ==0){
		    System.out.println("dosa is out of stock");
		}
		if(totalpouchesQ==0) {
			System.out.println("pouches is out of stock");
		}
		if (totalpanipuriQ==0){
			System.out.println("panipuri is out of stock");
		}
		if(totalmasalaQ==0){
		   System.out.println("masala is out of stock");
		}
			
	}
	void availableStock(){
		if(totalmaggieQ>0 && totalmaggieQ<50){
		   System.out.println("maggie is available in stock " +totalmaggieQ);
		}
		if(totaldosaQ>0 && totaldosaQ<43){
			System.out.println("dosa is available in stock " +totaldosaQ);
		}
		if(totalpouchesQ>0 && totalpouchesQ<39){
			System.out.println("pouches is available in stock " +totalpouchesQ);
		}
		if(totalpanipuriQ>0 && totalpanipuriQ<43){
			System.out.println("panipuri is available in stock " +totalpanipuriQ);
		}
		if(totalmasalaQ>0 && totalmasalaQ<73){
			System.out.println("masala is available in stock "+totalmasalaQ);
		}
	}
	
    public static void main(String[] args) {
		Shop shop = new Shop();
		shop.shopping(30,21,10,43,73);
		shop.outOfStock();
		shop.availableStock();
		
	}

}
