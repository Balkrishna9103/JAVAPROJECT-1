package madhuriR;
class StudentResult{
	void resultScore(int marks){
		if(marks >= 90 && marks <=100){
			System.out.println("Pass with "+ marks +" percentage with A+ grade");
		}else if(marks >= 80 && marks <= 90){
			System.out.println("Pass with "+ marks +" percentage with A grade");
		}else if(marks >=70 && marks <= 80){
			System.out.println("Pass with "+ marks +" percentage with B+ grade");
		}else if(marks >=60 && marks <=70){
			System.out.println("Pass with "+ marks +" percentage with B grade");
		}else if(marks >=50 && marks <=60){
			System.out.println("Pass with "+ marks +" percentage with D grade");
		}else if(marks >=0 && marks<=50){
			System.out.println("Failed");
		}else
			System.out.println("Invalid Number");
	}
	public static void main(String[] args){
		StudentResult studentresult = new  StudentResult();
		studentresult.resultScore(95);
		studentresult.resultScore(80);
		studentresult.resultScore(-10);
		studentresult.resultScore(45);
		studentresult.resultScore(72);
		studentresult.resultScore(3);
		studentresult.resultScore(105);	
	}

}