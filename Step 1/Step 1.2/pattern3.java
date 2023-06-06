/*
 * Geek is very fond of patterns. Once, his teacher gave him a  pattern to solve. He gave Geek an integer n and asked him to build a pattern.

Help Geek to build a pattern.

1
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5

 */

import java.util.Scanner;
public class pattern3 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter n");
        int n = S.nextInt();
        S.close();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print(j+" ");
            System.out.println();
        }
    }
}
