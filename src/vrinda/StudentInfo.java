package vrinda;

	public class StudentInfo
	{
		void studentName(String name, String middleName, String surname)
		{
			System.out.println(name);
			System.out.println(middleName);
			System.out.println(surname);
		}
		
		void studentOtherDetail(String birthdate,String address,String Address1, int rollNumber)
		{
			System.out.println(birthdate);
			System.out.println(address);
			System.out.println(rollNumber);
		}
		
		public static void main(String[] args) {
			StudentInfo studentInfo = new StudentInfo();
			studentInfo.studentName("vrinda","Devi","Dasi");
			studentInfo.studentOtherDetail("10th may 1984","Barsana","Mathura",108);	
		}
	}
