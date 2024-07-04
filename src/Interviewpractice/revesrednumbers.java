package Interviewpractice;

import java.util.Scanner;

public class revesrednumbers {
    public static void main(String[] args)
    {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter the number:");
        //Approach 1 (Alogorithm)
        int num = number.nextInt();
     /*   int rev = 0;
        while(num != 0)
        {
            rev = rev*10 + num%10;
            num = num/10;
        }
        //Approach 2(String Buffer)
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer rev = sb.reverse();*/
        StringBuilder sb = new StringBuilder();
        sb.append(num);
        StringBuilder rev = sb.reverse();
        System.out.print("The rev number is: "+rev);
    }
}
