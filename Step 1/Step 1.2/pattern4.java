/*   1
    2 2 
    3 3 3 
    4 4 4 4 
    5 5 5 5 5
 * 
 */

import java.util.Scanner;
public class pattern4 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter n");
        int n = S.nextInt();
        S.close();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print(i+" ");
            System.out.println();
        }
    }
}