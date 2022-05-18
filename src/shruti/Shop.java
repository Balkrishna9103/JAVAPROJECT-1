package shruti;

public class Shop {
	int totalQMaggie =50;
	int totalQDosa = 43;
	int totalQPouches = 39;
	int totalQPanipuri = 43;
	int totalQMasala = 73;
	void shopping(int maggieQ , int dosaQ ,int pouchesQ , int panipuriQ,int masalaQ) {
		if(maggieQ <= totalQMaggie) {
			totalQMaggie-= maggieQ;
			System.out.println("Available quantity of Maggie " + totalQMaggie );
		}
		else
			totalQMaggie=0;
		if(dosaQ <= totalQDosa) {
			totalQDosa -= dosaQ;
			System.out.println("Avaiable quantity of Dosa " + totalQDosa);
		}
		else
			totalQDosa=0;
		if(pouchesQ <= totalQPouches) {
			totalQPouches -= pouchesQ;
			System.out.println("Avaiable quantity of Dosa " + totalQDosa);
		}
		else
			totalQPouches=0;
		if(panipuriQ <=totalQPanipuri) {
			totalQPanipuri -= panipuriQ;
			System.out.println("Avaiable quantity of panipuri " + totalQPanipuri );
		}
		else
			totalQPanipuri=0;
		if(masalaQ <= totalQMasala ) {
			totalQMasala -= masalaQ;
			System.out.println("Avaiable quantity of masalaQ " + totalQMasala );
		}
		else
			totalQMasala=0;
	}
	void showOutOfStock() {
		if(totalQMaggie == 0)
			System.out.println(" Maggie is Out of Stock");
		if(totalQDosa == 0)
			System.out.println(" Dosa is Out of Stock");
		if(totalQPouches == 0)
			System.out.println(" Pouches is Out of Stock");
		if(totalQPanipuri == 0)
			System.out.println(" Panipuri is Out of Stock");
		if(totalQMasala == 0)
			System.out.println(" Masala is Out of Stock");
	}
	public static void main(String[] a) {
		Shop shop =  new Shop();
		shop.shopping(40,25,99 ,43,73);
		shop.showOutOfStock();
	}
}
			
			
			
			
			
			
		
			
	
			
		
		
			
		
	
			


