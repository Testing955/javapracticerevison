package Functions;

public class Calculator 
{
public int addnumber(int num1, int num2)
{
int sum = num1*num2;
return sum;
}
public static void main(String args[])
{
Calculator calc=new Calculator();
int add = calc.addnumber(50, 60);
System.out.println("The total of the value is: "+add);
}
}
