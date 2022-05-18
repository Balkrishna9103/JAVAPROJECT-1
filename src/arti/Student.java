package arti;
class Student{
	String name="Arti";
	int rno=1;

void displayinfo(){
	System.out.println(name);
	System.out.println(rno);
}
public static void main(String[] args){

Student s=new Student();
s.displayinfo();
}
}