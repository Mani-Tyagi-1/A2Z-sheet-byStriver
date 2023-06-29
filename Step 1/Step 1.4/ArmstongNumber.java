/*
For a given 3 digit number, find whether it is armstrong number or not. An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself. Return "Yes" if it is a armstrong number else return "No".
NOTE: 371 is an Armstrong number since 33 + 73 + 13 = 371
   

 */
import java.util.*;
public class ArmstongNumber {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n;
        System.out.println("Enter value");
        n = S.nextInt();
        S.close();
        int temp = n;
        int ans=0;
        while(n!=0)
        {
            int d = n % 10;
            n = n / 10;
            ans += d * d * d;
        }
        if(ans==temp)
        System.out.println("Armstrong number");
        else
        System.out.println("Not an Armstrong number");
    }
}
