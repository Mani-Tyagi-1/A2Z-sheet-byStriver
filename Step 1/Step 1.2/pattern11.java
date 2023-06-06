/*
 *
 
1 
0 1 
1 0 1
0 1 0 1 
1 0 1 0 1

 */


import java.util.Scanner;
public class pattern11 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n;
        System.out.println("Enter n");
        n = S.nextInt();
        S.close();
        int p = 0, q = 1;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                p = 0;
                for(int j=1;j<=i;j++)
                {
                    System.out.print(p+" ");
                    if(p==0)
                        p = 1;
                    else
                        p = 0;
                }
                System.out.println();
            }
            else
            {
                q = 1;
                for(int j=1;j<=i;j++)
                {
                    System.out.print(q+" ");
                    if (q == 1)
                        q = 0;
                    else
                        q = 1;
                }
                System.out.println();
            }
        }
        
    }
}
