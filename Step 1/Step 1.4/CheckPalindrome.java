/*
Given an integer, check whether it is a palindrome or not.

Example 1:

Input: n = 555
Output: Yes
 */

import java.util.*;
public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n;

        System.out.println("Enter number");
        n = S.nextInt();
        S.close();

        int temp = n;
        int rev = 0;
        while(n!=0)
        {
            int d = n % 10;
            n = n / 10;
            rev = (rev * 10) + d;
        }
        if(rev==temp)
        System.out.println("Yes! it is palindrome number");
        else
        System.out.println("No! it is not a palindrome number");
    }
    
}