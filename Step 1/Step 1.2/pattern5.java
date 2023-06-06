/*
 *   * * * * *
 *   * * * * 
 *   * * * 
 *   * * 
 *   *
 */


import java.util.Scanner;
public class pattern5 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n;
        System.out.println("Enter n");
        n = S.nextInt();
        S.close();

        for(int i=n;i>0;i--)
        {
            for(int j=0;j<i;j++)
                System.out.print("* ");
            System.out.println();
        }
        
    }
}