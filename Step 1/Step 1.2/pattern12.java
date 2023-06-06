/*
 
1                 1
1 2             2 1
1 2 3         3 2 1
1 2 3 4     4 3 2 1
1 2 3 4 5 5 4 3 2 1

 */


import java.util.Scanner;
public class pattern12 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n;
        System.out.println("Enter n");
        n = S.nextInt();
        S.close();
        int p=(4*n)-4;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print(j + " ");
                
            for (int k = 0; k < p;k++)
            {
                System.out.print(" ");
            }
            for (int l = i; l >= 1; l--)
            System.out.print(l+" ");
            p -= 4;
            System.out.println();


        }
        
    }
}
