/*
 *     print the pattern
 *      Geek is very fond of patterns. Once, his teacher gave him a square pattern to solve. He gave Geek an integer n and asked him to build a pattern.
Help Geek to build a star pattern.

example :- intput=5
          * * * * *
          * * * * *
          * * * * *
          * * * * *
          * * * * *
 * 
 */
import java.util.Scanner;
 public class pattern1 {
 public static void main(String[] args) {
    Scanner S = new Scanner(System.in);
    int n; 
    System.out.println("Enter n");
    n = S.nextInt();

    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
            System.out.print("* ");
        System.out.println();
    }

 }
    
 }