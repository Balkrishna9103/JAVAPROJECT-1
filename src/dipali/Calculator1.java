// Assignment2  1.Calculator program using parameters

package dipali;
class Calculator1
{
void addition(int a,int b)
{
System.out.println("Addition of "+a+" and "+b+" is = "+(a+b));
}
void substraction(int num1,int num2)
{
System.out.println("substraction of "+num1+" and "+num2+" is = "+(num1-num2));
}
void divition(int x,int y)
{
System.out.println("divition of "+x+" and "+y+" is = "+(x/y));
}
public static void main(String[] args)
{
Calculator1 cal=new Calculator1();
cal.addition(30,40);
cal.substraction(60,30);
cal.divition(30,5);
}
}
