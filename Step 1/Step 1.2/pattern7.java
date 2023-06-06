/*       *
       * * *
     * * * * * 
   * * * * * * * 
 * * * * * * * * * 
 
 *    
 */


import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n;
        System.out.println("Enter n");
        n = S.nextInt();
        S.close();
        int p = n + 2;
        int q = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= p; j++)
                System.out.print(" ");
            for (int k = 1; k <= i; k++)
                System.out.print("* ");
            if (i > 1) {
                for (int k = 0; k < q; k++)
                {
                    System.out.print("* ");
                }
                q += 1;
            }
                p -= 2;
            System.out.println();
        }
    }
}
