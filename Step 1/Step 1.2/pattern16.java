/*

A 
B B       
C C C     
D D D D   
E E E E E

 */



import java.util.Scanner;
public class pattern16 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n;
        System.out.println("Enter n");
        n = S.nextInt();
        S.close();
        int p = 65;
        for(int i=1;i<=n;i++)
        {
            
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)p+" ");
            }
            p++;
            System.out.println();
        }
    }
}