// Given a string S, check if it is palindrome or not.

import java.util.Scanner;

public class reverseAnArray {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter number");
        java.lang.String str = S.next();
        S.close();

        int end = str.length()-1;
        int start = 0;

        while(start<end)
        {
            if (str.charAt(start) != str.charAt(end))
            {
                System.out.println("This is not a palindrome number");
                return;        
            }
            start++;
            end--;
        }
        System.out.println("This is palindrome number");
        

    }
}
