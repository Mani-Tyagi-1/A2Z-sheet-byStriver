/* 
Given two integers, n and m. The task is to check the relation between n and m.
Example 1:
Input:
n = 4
m = 8

Output:
lesser

Explanation:
4 < 8 so print 'lesser'.

*/

import java.util.Scanner;

public class gfgProblem {
public static void main(String[] args) {
    Scanner S = new Scanner(System.in);

    int m, n;
    System.out.println("Enter value of m");
    m = S.nextInt();
    System.out.println("Enter value of n");
    n = S.nextInt();
    
    if(n<m)
        System.out.println("lesser");
        else if(n>m)
            System.out.println("greater");
            else
                System.out.println("equal");
}
}