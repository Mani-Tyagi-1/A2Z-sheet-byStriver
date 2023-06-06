/*
 * Geek is very fond of patterns. Once, his teacher gave him a pattern to solve. He gave Geek an integer n and asked him to build a pattern.
   Help Geek to build a star pattern.

        * 
        * * 
        * * * 
        * * * * 
        * * * * *
 */

import java.util.Scanner;
public class pattern2 {
   public static void main(String[] args) {
       Scanner S = new Scanner(System.in);
       int n;
       System.out.println("Enter n");
       n = S.nextInt();
       S.close();
       System.out.println();

       for(int i=0;i<n;i++)
       {
        for(int j=0;j<=i;j++)
            System.out.print("* ");
        System.out.println();
       }
   } 
}
