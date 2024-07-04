package Interviewpractice;

public class reversequestion 
{
public static void main(String args[]) {
	/*String original = "hello";
String reverse = reverseString(original);
System.out.println("Reversed string of '" + original + "' is '"+reverse+ "'");
}
public static String reverseString(String s)
{
return new StringBuilder(s).reverse().toString();
}
public static void main(String args[])
{
String original = "My name is Prince";
String reverse = reverseString(original);
System.out.println("The revesre string is '" + original + "' is '"+reverse+ "'");
}
public static String reverseString(String p)
{
return new StringBuilder(p).reverse().toString();
}
	
String p = "Java reverse";
String k = reverseString(p);
System.out.println("The reverse string " + p + "' is '"+ k);
}
public static String reverseString(String o)
{
return new StringBuilder(o).reverse().toString();
}
String i = "My name is Prince";
String name = reverseString(i);
System.out.println("The reverse of the name " + i + "' is '"+ name);
}
public static String reverseString(String h)
{
return new StringBuilder(h).reverse().toString();
}*/
/*String mobile = "My iphone battery is down";
String battery = reverseString(mobile);
System.out.println("The revese name of " + mobile + "' is '"+battery);
}
public static String reverseString(String u)
{
return new StringBuilder(u).reverse().toString();
}*/
/*String p = "My name is Prince";
String c[] = p.split(" ");
StringBuilder reversed = new StringBuilder();
for(int i =c.length-1;i>=0;i--)
{
reversed.append(c[i]);
if(i>0)
{
reversed.append(" ");
}
}
System.out.println(reversed.toString());*/
String ink = "The inke colour is blue";
String pen []= ink.split(" ");
StringBuilder sb = new StringBuilder();
for(int i = pen.length-1;i>=0;i--)
{
sb.append(pen[i]);
if(i>0)
{
sb.append(" ");
}
}
System.out.println(sb.toString()
		);
}
}

