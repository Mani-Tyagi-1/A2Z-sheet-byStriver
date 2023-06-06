/*


A       
A B     
A B C   
A B C D 
A B C D E 

 */



import java.util.Scanner;
public class pattern14 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n;
        System.out.println("Enter n");
        n = S.nextInt();
        S.close();
        int a = 65;
        for(int i=1;i<=n;i++)
        {
            a = 65;
            for (int j = 0; j < i; j++)
            {
                System.out.print((char)a+" ");
                a++;
            }
            System.out.println();
        }
        
    }
}
