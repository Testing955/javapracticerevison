package Interviewpractice;

public class Differentstringreversedmethods {

	public static void main(String[] args) {
		//Approach 1 (using inbuild method)
		String name = "My name is Prince";
		StringBuilder reverseName=new StringBuilder(name);
		reverseName.reverse();
		String reversedName=reverseName.toString();
		System.out.println(reversedName);
	}

}
