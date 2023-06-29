//Given a positive integer N., The task is to find the value of    \sum_{i=1}^{i=n} F(i)  where function F(i) for the number i be defined as the sum of all divisors of ‘i‘.

/*

Input:
N = 4
Output:
15
Explanation:
F(1) = 1
F(2) = 1 + 2 = 3
F(3) = 1 + 3 = 4
F(4) = 1 + 2 + 4 = 7
ans = F(1) + F(2) + F(3) + F(4)
    = 1 + 3 + 4 + 7
    = 15


 */

import java.util.Scanner;

public class PrintAllDivisor {
    static int divisor(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if (n % i == 0)
                sum += i;
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int num,sum=0;

        System.out.println("Enter number");
        num = S.nextInt();
        S.close();
        for(int i=1;i<=num;i++)
        {
            sum += divisor(i);
        }
        System.out.println("Sum of divisor="+sum);


    }

}
