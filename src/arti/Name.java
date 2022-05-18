package arti;
class Name{
			String firstName = "Arti";
			String middleName = "Ganesh";
			String lastName = "Shinde";
			
			void firstNameD(){
							System.out.println("FirstName : " + firstName);
			}
			
			void middleNameD(){
							System.out.println("MiddleName : " + middleName);
			}
			
			void lastNameD(){
							System.out.println("LastName : " + lastName);
			}
			
			public static void main(String[] args)
			{
				Name name=new Name();
				name.firstNameD();
				name.middleNameD();
				name.lastNameD();
			
			}
}