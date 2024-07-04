package Interviewpractice;

import java.util.Arrays;

public class printfirstletter 
{
public static void main(String args[])
{
/*String op = "My name is Prince";
String word[]=op.split("\\s+");
System.out.println("The first character of the op: " + op + "' are '");
for(String words:word)
{
if(!words.isEmpty())
{
System.out.print(words.charAt(0) +" ");
}
}
System.out.println();
String k = reverseString(op);
System.out.println("The reverse of " +op+ "' is '"+ k);
}
public static String reverseString(String h)
{
return new StringBuilder(h).reverse().toString();*/
	
String date = "12/05/2024 05:30";
String d[] = date.split("[^0-9]+");
int[] numbers = new int[d.length];
int index = 0;
for(String dates:d)
{
if(!dates.isEmpty())
{
	numbers[index++] = Integer.parseInt(dates);
}
}
Arrays.sort(numbers);
for (int number : numbers) {
    if (number != 0) {
        System.out.println(String.format("%02d", number)); // Format the output with leading zeros
    }
}

}

}

