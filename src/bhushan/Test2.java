package bhushan;

public class Test2 {
	int maggie=50;
	int dosa=43;
	int oil_pack=39;
	int panipuri=43;
	int masala=73;
	
	void m1(int req_maggie,int req_dosa,int req_oil_pack,int req_panipuri,int req_masala) {
		if(maggie>=req_maggie){
			maggie=maggie-req_maggie;
		}else
			System.out.println("maggie is out of stock");
		if(dosa>=req_dosa){
			dosa=dosa-req_dosa;
		}else
			System.out.println("dosa is out of stock");
		if(oil_pack>=req_oil_pack){
			oil_pack=oil_pack-req_oil_pack;
		}else
			System.out.println("oil_pack is out of stock");
		if(panipuri>=req_panipuri){
			panipuri=panipuri-req_panipuri;
		}else
			System.out.println("panipuri is out of stock");
		if(masala>=req_masala){
			masala=masala-req_masala;
		}else
			System.out.println("masala is out of stock");
		
		
	}
	
	void m2() {
		if(maggie<=0){
			System.out.println("maggie is out of stock");
		}
		if(dosa<=0){
			System.out.println("Dosa is out of stock");
		}
		if(oil_pack<=0){
			System.out.println("oil_pack is out of stock");
		}
		if(panipuri<=0){
			System.out.println("panipuri is out of stock");
		}
		if(masala<=0){
			System.out.println("masala is out of stock");
		}
	}
	
	void m3() {
		if(maggie>0){
			System.out.println("Stock of maggie is "+ maggie);
		}
		if(dosa>0){
			System.out.println("Stock of Dosa is "+dosa);
		}
		if(oil_pack>0){
			System.out.println("Stock of oil_pack is "+oil_pack);
		}
		if(panipuri>0){
			System.out.println("Stock of panipuri is "+panipuri);
		}
		if(masala>0){
			System.out.println("Stock of masala is "+masala);
		}
		
	}
	
public static void main(String[] args) {
	Test2 test2=new Test2();
	test2.m1(50, 39, 20, 43, 33);
	test2.m2();
	test2.m3();
}
}
