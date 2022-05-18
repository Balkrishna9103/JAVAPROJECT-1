/*
WAP that print output as below
On user defined range (1-100), 
if number is div by 3, print 6 is div by 3
if number is div by 5, print 10 is div by 5
if number is div by 3&5, print 15 is div by 3 & 5
------------------------------
output : 
3 is div by 3
5 is div by 5
6 is div by 3
9 is div by 3
10 is div by 5
12 is div by 3
15 is div by 3 & 5
18 is div by 3
20 is div by 5
.
.
.
.
30 is div by 3 & 5S
 */
package amruta.Test_01;

public class Test1 {

	void numDivisibleBy(int startNum, int endNum) {

		for (int no = startNum; no <= endNum; no++) {

			if (no % 3 == 0 && no % 5 == 0)
				System.out.println(no + " is divisible by 3 & 5");
			else if (no % 3 == 0)
				System.out.println(no + " is divisible by 3");
			else if (no % 5 == 0)
				System.out.println(no + " is divisible by 5");
			else
				System.out.println(no + " is divisible by 5");
		}
	}

	public static void main(String[] args) {
		Test1 test = new Test1();
		test.numDivisibleBy(1, 100);
	}
}
