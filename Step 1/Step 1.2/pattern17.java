
/*

    A  
   ABA 
  ABCBA
 ABCDCBA
ABCDEDCBA

 */




import java.util.Scanner;
public class pattern17 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n;
        System.out.println("Enter n");
        n = S.nextInt();
        S.close();
        int p = 65;
        int r = 63;
        int q = n - 1;
        int s=1;
        for(int i=1;i<=n;i++)
        {
            p = 65;
            for(int j=1;j<=q;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print((char) p );
                p++;
            }
            q -= 1;
            
            r += 1;
            if (i > 1)
            {
                int x = r;
                for (int l = 1; l < s; l++) {
                    System.out.print((char) x);
                    x--; 
                }
            }
            s++;
                System.out.println();
            
        }
    }
}
