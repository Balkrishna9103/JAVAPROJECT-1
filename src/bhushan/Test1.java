package bhushan;

public class Test1 {void disp(int val1 ,int val2) {
	for(int index=val1;index<=val2;index++) {
		if(index %3==0 & index %5==0) {
			System.out.println(index+"is Div by 3&5");
		}else if (index %3==0){
			System.out.println(index+"is Div by 3");
		}else if(index %5==0) {
			System.out.println(index+"is Div by 5");
		}
	}
}
public static void main(String[] args){
Test1 test1=new Test1();
test1.disp(1,100);
}

}
