/*
Given a 32 bit number X, reverse its binary form and print the answer in decimal.

Input:
X = 1
Output:
2147483648 
Explanation:
Binary of 1 in 32 bits representation-
00000000000000000000000000000001
Reversing the binary form we get, 
10000000000000000000000000000000,
whose decimal value is 2147483648.

 */

import java.util.*; 
public class ReverseBit {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.println("Enter number");
        int n = S.nextInt();
        S.close();

        long pow = 31;
        long res = 0;

        while(n!=0)
        {
            res += (n & 1) << pow;
            pow--;
            n = n >> 1;
        }
        System.out.println("Answer is "+Math.abs(res));

    }
}
