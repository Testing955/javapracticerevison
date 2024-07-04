package Functions;

public class Fullname 
{
public int acco(int accno, int bal)
{
int bank = accno+bal;
return bank;
}
public static void main(String args[]) 
{
Fullname fn = new Fullname();
int balance = fn.acco(400, 509);
System.out.println("The total balance is:"+balance);
}
}
