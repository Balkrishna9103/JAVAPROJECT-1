package arpit;

public class test2 {
	 int finalMaggi=50;
	 int finalDosa=43;
	 int finalPou=39;
	 int finalPanipuri=43;
	 int finalMasala=73;
	
	public static void main(String[] args) {
		test2 test = new test2();
		test.shopping(15,20,39,40,50);
		test.showOut();
		test.showAvailable();
		
	}
	
	 void shopping(int maggie,int dosa, int pou, int panipuri, int masala) {
		
		
		if((finalMaggi-maggie)<0 || (finalDosa-dosa)<0 || (finalPou-pou)<0 || (finalPanipuri-panipuri)<0 || (finalMasala-masala)<0) {
			System.out.println("Running Out Of Stock !!!");
		}
		else{
			finalMaggi -=maggie;
			finalDosa -=dosa;
			finalPou -= pou;
			finalPanipuri -=panipuri;
			finalMasala -= masala;
			System.out.println("Maggie:- "+finalMaggi);
			System.out.println("Dosa:- "+finalDosa);
			System.out.println("Pouches:- "+finalPou);
			System.out.println("Panipuri:- "+finalPanipuri);
			System.out.println("Masala:- "+finalMasala);
			System.out.println("-----------------------------------------------------");
			
		}
	}
	 void showOut() {
		if(finalMaggi<=0) {
			System.out.println("Maggie Out of Stock!");
		}
		if(finalDosa<=0) {
			System.out.println("Dosa Out of Stock!");
		}
		if(finalPou<=0) {
			System.out.println("Pouches Out of Stock!");
		}
		if(finalPanipuri<=0) {
			System.out.println("Panipuri Out of Stock!");
		}
		if(finalMasala<=0) {
			System.out.println("Masala Out of Stock!");
		}
		System.out.println("-----------------------------------------------------");
		
	}
	 void showAvailable() {
		if(finalMaggi>0) {
			System.out.println("Maggie In Stock!");
		}
		if(finalDosa>0) {
			System.out.println("Dosa In Stock!");
		}
		if(finalPou>0) {
			System.out.println("Pouches In Stock!");
		}
		if(finalPanipuri>0) {
			System.out.println("Panipuri In Stock!");
		}
		if(finalMasala>0) {
			System.out.println("Masala In Stock!");
		}
		System.out.println("-----------------------------------------------------");
	}
}
