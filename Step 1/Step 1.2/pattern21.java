/*

******
*    *
*    *
*    *
******

 */

 import java.util.Scanner;

 public class pattern21 {
     public static void main(String[] args) {
         Scanner S = new Scanner(System.in);
         int n;
         System.out.println("Enter n");
         n = S.nextInt();
         S.close();

         for (int i = 1; i <= n; i++) {
             if (i == 1 || i == n) {
                 for (int j = 0; j <= n; j++) {
                     System.out.print("*");
                 }
             } else {
                 System.out.print("*");
                 for (int j = 1; j < n; j++) {
                     System.out.print(" ");
                 }
                 System.out.print("*");
             }
             System.out.println();

         }
     }
 }
