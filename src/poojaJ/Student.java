package poojaJ;
class Student {
		String name= "Pooja";
		int rno=1;
		
		void displayInfo(){
			System.out.println(name);
			System.out.println(rno);
		}
		
		public static void main(String[] args){
			System.out.println("Hello");
			Student std = new Student();
			std.displayInfo();
			System.out.println("Hi");
			
		}

}