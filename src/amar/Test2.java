package amar;

public class Test2 {
	
	int maggie= 50;
	int dosa= 43;
	int pouches= 39;
	int panipuri= 43;
	int masalas= 73;
	
	void shopping(int maggieQ, int dosaQ, int pouchesQ, int panipuriQ, int masalaQ) {
		
		System.out.println("Available stocks : Quantity");
		System.out.println("          maggie : "+maggie);
		System.out.println("            dosa : "+dosa);
		System.out.println("         pouches : "+pouches);
		System.out.println("        panipuri : "+panipuri);
		System.out.println("         masalas : "+masalas);
		
		maggie= maggie - maggieQ;
		dosa= dosa - dosaQ;
		pouches= pouches - pouchesQ;
		panipuri= panipuri - panipuriQ;
		masalas= masalas - masalaQ;
		
	}
	
	void stocks() {
		
		  
		if(maggie>=1)
			System.out.println("Available in stock:"+" Quantity= "+maggie);			
		else
			System.out.println("out of stock");
				
				 
		if(dosa>=1)
			System.out.println("Available in stock:"+" Quantiy= "+dosa);
		else
			System.out.println("out of stock");
				 
		if(pouches>=1)
			System.out.println("Available in stock:"+" Quantity= "+pouches);
		else
			System.out.println("out of stock");
				 
		if(panipuri>=1)
			System.out.println("Available in stock:"+" Quantity "+panipuri);
		else
			System.out.println("out of stock");
				
		if(masalas>=1)
			System.out.println("Available in stock:"+" Quantity "+masalas);
		else
			System.out.println("out of stock");
		
		
	}
	
	public static void main(String[] args) {
		
		Test2 test2 = new Test2();
		test2.shopping(25,36,39,20,50);
		System.out.println("                                    ");
		test2.stocks();		
	}
		
}
