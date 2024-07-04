package Interviewpractice;

public class SpecificcharacterfromString 
{
/*public static char
getcharFromString(String str, int index)
{
return str.charAt(index);
}
public static void main(String args[])
{
String str = "My name is Prince";
int index = 4;
char ch = getcharFromString(str,index);
System.out.println("Character at String " + str + " At index of " + index + " is: " + ch  );
}*/
	
/*public static char
getcharfromString(String str,int index)
{
return str.charAt(index);
}
public static void main(String args[])
{
String str = "Jave programming String concept";
int index=8;
char ch =getcharfromString(str,index);
System.out.println("The value at the index: " + index + " is: " + ch);
}*/
/*public static char valueString(String name, int place)
{
return name.charAt(place);
}
public static void main(String args[])
{
String name = "The pen is blue";
int place = 4;
char ch = valueString(name,place);
System.out.println("The character at index: " + place + " is: " + ch );
}*/

/*public static char stringvalue(String series, int place)
{
return series.charAt(place);
}
public static void main(String args[])
{
String series = "Lord of ring";
int place = 6;
char p = stringvalue(series,place);
System.out.println("The value of " +series+ " at " + place + " is: " + p);
}*/

/*public static char stringvalue(String str, int index)
{
return str.charAt(index);
}
public static void main(String args[])
{
String str = "My name is chotiya";
int index = 4;
char t = stringvalue(str,index);
System.out.println("The character at: " +index+ " is " + t);
}*/

/*public static char stringvalue(String pen, int pencil)
{
return pen.charAt(pencil);
}
public static void main(String args[])
{
String pen = "Blue pen it is";
int pencil = 6;
char rubber = stringvalue(pen,pencil);
System.out.println("The value of the " +pen+ " at " + pencil + rubber);
}*/
//converting string to array
/*public static char stringvalue(String str, int index)
{
return str.toCharArray()[index];
}
public static void main(String args[])
{
String str = "Your name";
int index = 2;
char y = stringvalue(str,index);
System.out.println("The value at the " + index + " is: " + y);
}*/
/*public static char stringvalue(String p, int u)
{
return p.toCharArray()[u];
}
public static void main(String args[])
{
String p = "Laptop is fast";
int u = 3;
char y = stringvalue(p,u);
System.out.println("The value of the " +p+ " is: " +y);
}

	
	public static char pen(String ink, int colour)
	{
	return ink.charAt(colour);
	}
	public static void main(String args[])
	{
	String ink = "The pen colour is blue";
	int colour = 4;
	char e = pen(ink, colour);
	System.out.println("The colour of the ink is: " +ink+ " at index " + e); 
	}*/
public static char watch(String min, int sec)
{
return min.charAt(sec);
}
public static void main (String args[])
{
String min ="The time is: ";
int sec = 6;
char g = watch(min,sec);
System.out.println(min + g);
}
}
	
//String into Stream
/*public static char stringvalue(String p , int y)
{
return p.chars().mapToObj(ch -> (char)ch).toArray(Character[] ::new)[y];
}
public static void main(String args[]) 
{
String p = "your name?";
int y = 2;
char ch = stringvalue(p,y);
System.out.println("character from "  + p + " at index " + y + " is " + ch);
}
}*/
