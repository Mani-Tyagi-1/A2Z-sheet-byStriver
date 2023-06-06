/*

**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********

 */

 import java.util.Scanner;
public class pattern19 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n;
        System.out.println("Enter n");
        n = S.nextInt();
        S.close();
        int p = n;
        int q = 0;
        int s = 2*(n - 1);
        int t = 1;
        for (int i = 0; i < 2 * n; i++)
        {

            if (i < n)
            {

                for (int j = 0; j < p; j++) {
                    System.out.print("*");
                }
                for (int k = 0; k < q; k++) {
                    System.out.print(" ");
                }
                q += 2;
                for (int j = 0; j < p; j++) {
                    System.out.print("*");
                }
                p--;
                System.out.println();
            }
            else if(i>=n)
            {
                for(int j=1;j<=t;j++)
                {
                    System.out.print("*");
                }
                for (int k = 0; k < s; k++)
                {
                    System.out.print(" ");
                }
                s -= 2;
                for(int j=0;j<t;j++)
                {
                    System.out.print("*");
                }
                t++;
                System.out.println();
            }
        }
    }
}
