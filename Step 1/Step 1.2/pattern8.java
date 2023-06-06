/*
 *
 * * * * * * * * * 
   * * * * * * * 
     * * * * * 
       * * *
         *
 
 */
 

 
import java.util.Scanner;
public class pattern8 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n;
        System.out.println("Enter n");
        n = S.nextInt();
        S.close();
        int p = 0;
        int q= (2*n)-1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<p;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<q;k++)
            {
                System.out.print("* ");
            }
            p+=2;
            q-=2;
            System.out.println();
        }
        
    }
}