/*
 *       *
       * * *
     * * * * * 
   * * * * * * * 
 * * * * * * * * * 
 * * * * * * * * * 
   * * * * * * * 
     * * * * * 
       * * *
         *
 */

import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter n");
        int n = S.nextInt();
        S.close();
        int p = n/2 + 2;
        int q = 1;
        int r = 0;
        int s = (n) - 1;
        for (int i = 1; i <= n; i++) {
            if (i <= (n / 2)) {
                for (int j = 0; j <= p; j++)
                    System.out.print(" ");
                for (int k = 1; k <= i; k++)
                    System.out.print("* ");
                if (i > 1) {
                    for (int k = 0; k < q; k++) {
                        System.out.print("* ");
                    }
                    q += 1;
                }
                p -= 2;
                System.out.println();
            }
            else  {
                for (int l = 0; l < r; l++) {
                    System.out.print("  ");
                }
                for (int m = 0; m < s; m++) {
                    System.out.print("* ");
                }
                r += 1;
                s -= 2;
                System.out.println();
            }
        }
    }
}

