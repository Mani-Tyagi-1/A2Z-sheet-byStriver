// Given and integer N.Calculate the sum of series 13 + 23 + 33 + 43 + … till N-th term.

import java.util.*;
public class SumOfSeries {
    static int sos(int num)
    {
        if(num==0)
            return 0;
        else {
            return (num * num * num) + sos(num - 1);
            }
    }
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int num;
        System.out.println("Enter Number");
        num = S.nextInt();
        S.close();
        System.out.println(sos(num));


    }
}
