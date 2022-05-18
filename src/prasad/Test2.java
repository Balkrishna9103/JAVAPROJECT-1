package prasad;

class Test2 {
int maggeie = 50;
int dosa =43;
int pouches =39;
int panipuri = 43;
int masala = 73;

void shopping(int maggieQuanity,int dosaQuanity,int pouchesQuanity, int panipuriQuanity,int masalaQuanity) {
	if (maggieQuanity < maggeie) {
		maggeie = maggeie - maggieQuanity;
		System.out.println(" The available stock of maggie: " + maggeie);
	} else
		System.out.println(" Sorry maggie running out of stock");	
	if (dosaQuanity < dosa) {
		dosa = dosa - dosaQuanity;
		System.out.println(" The available stock of dosa: " + dosa);
	} else
		System.out.println(" Sorry maggie running out of stock");
	if (pouchesQuanity < pouches) {
		pouches = pouches - pouchesQuanity;
		System.out.println(" The available stock of pouches:  " + pouches);
	} else
		System.out.println(" Sorry pouches running out of stock");
	if (panipuriQuanity < panipuri) {
		panipuri = panipuri - panipuriQuanity;
		System.out.println(" The available stock of panipuri: " + panipuri);
	} else
		System.out.println(" Sorry panipuri running out of stock");
	if (masalaQuanity < masala) {
		masala = masala - masalaQuanity;
		System.out.println(" The available stock of masala: " + masala);
	} else
		System.out.println(" Sorry masala running out of stock");
}
 	public static void main(String[] args) {
 		Test2 test2 = new Test2();
 		test2.shopping(45, 35, 30, 43, 73);
 	}
}

