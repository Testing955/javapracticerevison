package Interviewpractice;

import java.util.Arrays;
import java.util.Collections;

public class Arraysorting 
{
public static void main(String args[])
{
int a[]= {10,20,1,3,4,0,5};
/*Arrays.sort(a);
System.out.println("The numbers are: "+Arrays.toString(a));*/
Arrays.sort(a);
System.out.println("Array in descending order:");
for (int i=a.length-1;i>=0;i--) 
{
    System.out.print(a[i] + " ");
}
}
}