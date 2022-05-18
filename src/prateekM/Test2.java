package prateekM;

public class Test2 {

	int totalMaggie=50;
	int totalDosa=43;
	int totalPouches=39;
	int totalPanipuri=43;
	int totalMasala=73;
	
	void shopping(int maggie, int dosa, int oilPouches, int panipuriPacket, int masalaPacket ) {
		
		totalMaggie = totalMaggie - maggie;
		totalDosa = totalDosa - dosa;
		totalPouches = totalPouches - oilPouches;
		totalPanipuri = totalPanipuri - panipuriPacket;
		totalMasala = totalMasala - masalaPacket;
	}
	
	void outofstock() {
		if (totalMaggie<=0) {
			System.out.println("Maggie is Out of stock");
			}else { 
				System.out.println("Available Maggie in stock is : "+totalMaggie);
			}
		if (totalDosa<=0) {
			System.out.println("Dosa is Out of stock");
			}else {
				System.out.println("Available Dosa in stock is : "+totalDosa);
			}
		if (totalPouches<=0) {
			System.out.println("Oil Pouches are Out of stock");
			}else {
				System.out.println("Available Oil Pouch in stock is : "+totalPouches);
			}
		if (totalPanipuri<=0) {
			System.out.println("Panipuri packets are Out of stock");
			}else {
				System.out.println("Available PaniPuri Packet in stock is : "+totalPanipuri);
			}
		if (totalMasala<=0) {
			System.out.println("Masala packets are Out of stock");
			}else {
				System.out.println("Available Masala Packet in stock is : "+totalMasala);
			}
		
	}
	
	public static void main(String[] args) {
		
		Test2 test2 = new Test2();
		test2.shopping(49, 43, 31, 3, 73);
		test2.outofstock();
	}
		 
}
