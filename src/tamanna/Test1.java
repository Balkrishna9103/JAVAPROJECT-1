/* WAP that print output as below
On user defined range (1-100), 
if number is div by 3, print 6 is div by 3
if number is div by 5, print 10 is div by 5
if number is div by 3&5, print 15 is div by 3 & 5
 Output :
3 is div by 3
5 is div by 5
6 is div by 3
9 is div by 3
10 is div by 5
12 is div by 3
15 is div by 3 & 5
.
.
.
30 is div by 3 & 5
*/

package tamanna;

public class Test1 {

	void division(int startIndex, int endIndex) {
		for(;startIndex<=endIndex;startIndex++) {
			if(startIndex%3==0 && startIndex%5==0) {
				System.out.println(startIndex+" is div by 3 & 5");
			}else if(startIndex%5==0) {
				System.out.println(startIndex+" is div by 5");
			}else if(startIndex%3==0) {
				System.out.println(startIndex+" is div by 3");
			}
		}
	}
	
	public static void main(String[] args) {
		Test1 test1=new Test1();
		test1.division(1, 100);
	}
}
