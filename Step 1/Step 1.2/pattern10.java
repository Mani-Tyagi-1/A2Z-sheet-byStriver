/*


*      
* * 
* * * 
* * * * 
* * * * *
* * * *
* * *
* *
*


 */


import java.util.Scanner;
public class pattern10 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n,p=1;
        System.out.println("Enter n");
        n = S.nextInt();
        S.close();

        for(int i=0;i<=(2*n);i++)
        {
            if(i<=n)
            {
                for(int j=0;j<=i;j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
            else
            {
                for(int k=0;k<=i-(2*p);k++)
                {
                    System.out.print("* ");
                }
                p++;
                System.out.println();
            }
        }
    }
}