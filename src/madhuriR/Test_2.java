package madhuriR;

public class Test_2 {
	int maggeie = 50;
	int dosa =43;
	int pouches =39;
	int panipuri = 43;
	int masala = 73;
	
	void shopping(int maggieQ,int dosaQ,int pouchesQ, int panipuriQ,int masalaQ) {
		if(maggieQ<=maggeie) {
			maggeie = maggeie-maggieQ;
			//System.out.println("current maggeeie stock "+ maggeie);
		}else
			System.out.println(" maggeeie running out of stock");	
		if(dosaQ<=dosa) {
			dosa = dosa-dosaQ;
			//System.out.println(" dosa current dosa stock "+ dosa);
		}else
			System.out.println(" dosa running out of stock");
		if(pouchesQ<=pouches) {
			pouches = pouches-pouchesQ;
			//System.out.println(" pouches  current  stock "+ pouches);
		}else
			System.out.println(" pouches running out of stock");
		if(panipuriQ<=panipuri) {
			panipuri = panipuri-panipuriQ;
			//System.out.println(" panipuri  current dosa stock "+ panipuri);
		}else
			System.out.println(" panipuri running out of stock");
		if(masalaQ<=masala) {
			masala = masala-masalaQ;
			//System.out.println(" masala  current dosa stock "+ masala);
		}else
			System.out.println(" masala running out of stock");
		
		System.out.println("***********************************");

	}
	
	void availableStock() {
		if(maggeie>0) {
			System.out.println("stock of maggeie is "+maggeie);
		}
		if(dosa>0) {
			System.out.println("stock of dosa is "+dosa);
		}
		if(pouches>0) {
			System.out.println("stock of pouches is "+pouches);
		}
		if(panipuri>0) {
			System.out.println("stock of panipuri is "+panipuri);
		}
		if(masala>0) {
			System.out.println("stock of masala is "+masala);
		}
		System.out.println("***********************************");
		
	}
	
	void outOfStock() {
		if(maggeie<=0) {
			System.out.println("maggeie is out of stock "+maggeie);
		}
		if(dosa<=0) {
			System.out.println("dosa out of stock "+ dosa);
		}
		if(pouches<=0) {
			System.out.println("Pouches out of stock "+ pouches);
		}
		if(panipuri<=0) {
			System.out.println("panipuri out of stock "+ panipuri);
		}
		if(masala<=0) {
			System.out.println("masala out of stock "+ masala);
		}
	}
	 public static void main(String[] args) {
		Test_2 test_2 = new Test_2();
		test_2.shopping(50, 40, 39, 42, 70);
		test_2.availableStock();
		test_2.outOfStock();
		
	}
}
