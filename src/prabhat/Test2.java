package prabhat;

public class Test2 {
	
		int maggieAvailableQ = 50;
		int dosaAvailableQ = 43;
		int pouchesAvailableQ = 39;
		int panipuriAvailableQ = 43;
		int masalaAvailableQ = 73;

		void shopping(int maggieQ, int dosaQ, int pouchesQ, int panipuriQ, int masalaQ) {	
			maggieAvailableQ = maggieAvailableQ - maggieQ;
			dosaAvailableQ = dosaAvailableQ - dosaQ;
			pouchesAvailableQ = pouchesAvailableQ - pouchesQ;
			panipuriAvailableQ = panipuriAvailableQ - panipuriQ;
			masalaAvailableQ = masalaAvailableQ - masalaQ;
			System.out.println("==>Shopping completed<==");
			outOfStock();
			availableStock();
		}

		void outOfStock() {
			if (maggieAvailableQ <= 0)
				System.out.println("maggie is running out of stock.");
			if (dosaAvailableQ <= 0)
				System.out.println("dosa is running out of stock.");
			if (pouchesAvailableQ <= 0)
				System.out.println("oil pouch is running out of stock.");
			if (panipuriAvailableQ <= 0)
				System.out.println("panipuri is running out of stock.");
			if (masalaAvailableQ <= 0)
				System.out.println("masala is running is out of stock.");
		}

		void availableStock() {
			if (maggieAvailableQ > 0)
				System.out.println("maggie is available = " + maggieAvailableQ);
			if (dosaAvailableQ > 0)
				System.out.println("dosa is available = " + dosaAvailableQ);
			if (pouchesAvailableQ > 0)
				System.out.println("oil pouch is available = " + pouchesAvailableQ );
			if (panipuriAvailableQ > 0)
				System.out.println("panipuri is availble = " + panipuriAvailableQ);
			if (masalaAvailableQ > 0)
				System.out.println("masala is available = " + masalaAvailableQ);
		}

		public static void main (String[] arg) {
			Test2 test2 = new Test2();
			test2.shopping(49,21,44,49,50);
		}
	}




