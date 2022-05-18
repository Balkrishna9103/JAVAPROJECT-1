package balkrishna;
class ExampleDiv{
 void display(){
  //int count=0;
  for(int num=5;num<=40;num++){
  if(num%7==0 || num%13==0){
   System.out.println(num);
    //count++;
	}
	}
	//System.out.println(count);
	}
	public static void main(String[] args){
		  ExampleDiv ExampleDiv = new ExampleDiv();
		  ExampleDiv.display();
	}
}