/*

E 
E D   
E D C 
E D C B 
E D C B A 

 */


import java.util.Scanner;
public class pattern18 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n;
        System.out.println("Enter n");
        n = S.nextInt();
        S.close();
        
        int ch = 65 + n-1;
        for(int i=1;i<=n;i++)
        {
            ch = 65 + n-1;
            for(int j=1;j<=i;j++)
            {
                System.out.print((char) ch+" ");
                ch--;
            }
            System.out.println();
        }
        
    }
}