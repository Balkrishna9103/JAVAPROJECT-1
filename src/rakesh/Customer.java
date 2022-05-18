package rakesh;
class Customer {
	//variables
	String custName = "Sir Manoj Golani";
	int price = 1250;
	String cate = "Electronics" ;
	
	//method
	void billDetails() {
		System.out.println("Customer details are as follows = ");

	}
	
	//main method
	public static void main (String[] arg) {
		//obbject
		Customer bill = new Customer() ;
		bill.billDetails();
		System.out.println("    Name = "+ bill.custName);
		System.out.println("    Total amount = Rs. "+ bill.price);
		System.out.println("    Purchase category = "+ bill.cate);
		System.out.println(bill.custName + bill.price +bill.cate );
		
	}
}


