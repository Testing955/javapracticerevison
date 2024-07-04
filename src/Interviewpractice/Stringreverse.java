package Interviewpractice;

public class Stringreverse {

	public static void main(String[] args) {
//Revesre String
//String p = "My Name is Prince";
		/*
		 * String p = "Testing"; StringBuilder sb = new StringBuilder(p); sb.reverse();
		 * String k = sb.toString(); System.out.println(k);
		 */

//Print the first letter of each word
//String p = "My name is Prince Gaurav";
		/*
		 * String p = "My QA Exprience in M & A"; String p2[]=p.split(" "); for(String
		 * p3:p2) { if(!p3.isEmpty()) { System.out.print(p3.charAt(0)); } }
		 */

//Reverse the whole String
	/*	String k = "My name is Prince Gaurav";
		String l1[] = k.split(" ");
		for (int i = l1.length - 1; i >= 0; i--) {
			System.out.print(l1[i]);
			if (i != 0) {
				System.out.print(" ");
			}
		} */
		
String month []= {"jan","feb","mar"};
for(int i = month.length-1;i>=0;i--)
{
System.out.println(month[i]+" ");
}

	}

}
