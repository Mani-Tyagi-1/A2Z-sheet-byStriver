/*

Given two numbers A and B. The task is to find out their LCM and GCD

Example 1:

Input:
A = 5 , B = 10
Output:
10 5
Explanation:
LCM of 5 and 10 is 10, while
thier GCD is 5.
 */
import java.util.*;

public class LCM_GCD {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n1, n2;
        System.out.println("Enter n1 and n2");
        n1 = S.nextInt();
        n2 = S.nextInt();
        S.close();

        // LCM
        
        int max = Math.max(n1, n2);
        while(true)
        {
            if(max %n1==0 && max %n2==0)
            {
                System.out.println("LCM is " + max);
                break;
            }
            max += 1;
        }

        //HCF
        int min = Math.min(n1, n2);
        int ans=-1;
        for(int j=1;j<=min;j++)
        {
            if (n1 % j == 0 && n2 % j == 0)
                ans = j;
        }
        System.out.println("HCF is " + ans);
        // another way
        // System.out.println("LCM is "+n1*n2/ans);
        
    }
}
