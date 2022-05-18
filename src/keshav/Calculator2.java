package keshav;

//Program 1:
//Calculator with parameterized method

class Calculator2 {

    void add(int num1, int num2) {
        int addition = num1 + num2;
        System.out.println("Sum is " + addition);
    }
	
	void subtract(int num3, int num4){
		int subtract = num3 - num4;
		System.out.println("Subtraction is " + subtract);
	}
	
	void multiply (int num5, int num6){
		int multiply = num5 * num6;
		System.out.println("Multiplication is " + multiply);
	}
	
	void divide (int num7, int num8){
		int divide = num7 / num8;
		System.out.println("division is " + divide);
	}
	
	
    public static void main (String[] args) {
    Calculator2 calculator2 = new Calculator2();
    calculator2.add(2,4);
	calculator2.subtract(12,3);
	calculator2.multiply(10,9);
	calculator2.divide(9,9);
	
    }
}

