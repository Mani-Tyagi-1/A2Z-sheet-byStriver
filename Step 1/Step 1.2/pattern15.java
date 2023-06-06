/*

A B C D E
A B C D
A B C
A B
A

 */


import java.util.Scanner;
public class pattern15 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n;
        System.out.println("Enter n");
        n = S.nextInt();
        S.close();
        int p = 65;
        for(int i=n;i>=1;i--)
        {
            p = 65;
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)p+" ");
                p++;
            }
            System.out.println();
        }
        
    }
}

