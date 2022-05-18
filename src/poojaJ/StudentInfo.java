/*Assignment -7 : 16th APR’22

Program Statement : Print all details of Student like Name, Middle name, Surname, birthdate, Address, and Roll number.

1. Create class called “StudentInfo”
2. Define 5 variables : Name, middle name, surname, birthdate(eg: 10th Aug 1998), Address as String and rollNumber as int.
3. Create two methods called studentName() and studentOtherDetails()
4. studentName() method should print details like Name, middle name, surname.
5. studentOtherDetails() method print details like birthdate, Address, and Roll number.
6. Create main method.
7. write a logic in main method.
	a. Create object of StudentInfo class.
	b. call studentName() and studentOtherDetails() method on reference variable
8. Compile & Run*/

package poojaJ;

public class StudentInfo{
	String name, middleName, surname, address, birthDate;
	int rollNo;
	
	void setData(){
		name="Pooja";
		middleName="Nandkishor";
		surname="Joshi";
		birthDate="17th Aug 1992";
		address= "a-509,NSG Royal one, Pune";
		rollNo=35;
	}
	
	void studentName(){
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surname);
	}
	
	void studentDetails(){
		System.out.println(birthDate);
		System.out.println(address);
		System.out.println(rollNo);
	}
	
	public static void main(String[] args) {
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.setData();
		studentInfo.studentName();
		studentInfo.studentDetails();
	}
}
