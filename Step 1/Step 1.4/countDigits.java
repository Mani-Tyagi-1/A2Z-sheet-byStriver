/*

Given a number N. Count the number of digits in N which evenly divides N.

Note :- Evenly divides means whether N is divisible by a digit i.e. leaves a remainder 0 when divided.
 
Example 1:

Input:
N = 12
Output:
2
Explanation:
1, 2 both divide 12 evenly

 */


import java.util.Scanner;
public class countDigits {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        int n;
        System.out.println("Enter a number");
        n = S.nextInt();
        S.close();

        int temp = n;
        int count = 0;
        while(n!=0)
        {
            int d = n % 10;
            n = n / 10;
            if (d>0 &&temp % d == 0 )
                count++;
        }
        System.out.println("Answer is "+count);
    }

}
