
/*
  class name : Test1
Branch Name : MaulikK_Test_1
Commit : "Test-1, programming test"

WAP that print output as below
On user defined range (1-100), 
if number is div by 3, print 6 is div by 3
if number is div by 5, print 10 is div by 5
if number is div by 3&5, print 15 is div by 3 & 5
 */
package ravneet;

public class Test1 {

	void divisiblebyThreeAndFive(int startrange, int endrange) {
		for (int i = startrange; i <= endrange; i++)
			if (i % 3 == 0 && i % 5 == 0)
				System.out.println(i + " Number is divisible by 3 and 5");
			else if (i % 3 == 0)
				System.out.println(i + " Number is divisible by 3");
			else if (i % 5 == 0)
				System.out.println(i + " Number is divisible by 5");
	}

	public static void main(String[] args) {
		Test1 test1 = new Test1();
		test1.divisiblebyThreeAndFive(1, 100);
	}
}
