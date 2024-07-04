package Functions;

public class Bank 
{
private int accno;
private int accbalance;
private String name;
private String lname;
private int accno(int accountnumber)
{
int accnumber = accountnumber;
return accnumber;
}
public static void main(String args[]) 
{
Bank bankdetails = new Bank();
int acc = bankdetails.accno(1234567890);
System.out.println("The bank account number is: "+acc);
}
}
