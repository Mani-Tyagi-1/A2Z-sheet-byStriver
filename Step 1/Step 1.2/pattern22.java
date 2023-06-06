/*

4 4 4 4 4 4 4 
4 3 3 3 3 3 4 
4 3 2 2 2 3 4 
4 3 2 1 2 3 4 
4 3 2 2 2 3 4 
4 3 3 3 3 3 4 
4 4 4 4 4 4 4 

 */

 import java.util.Scanner;

 public class pattern22 {
     public static void main(String[] args) {
         Scanner S = new Scanner(System.in);
         int n;
         System.out.println("Enter n");
         n = S.nextInt();
         S.close();

         int top, bottom, left, right;
         for (int i = 0; i < (2 * n) - 1; i++) {
             for (int j = 0; j < (2 * n) - 1; j++) {
                 top = i;
                 left = j;
                 bottom = (2 * n - 2) - i;
                 right = (2 * n - 2) - j;

                 System.out.print(n - (Math.min(Math.min(top, bottom), Math.min(left, right))) + " ");
             }
             System.out.println();

         }
     }
 }
