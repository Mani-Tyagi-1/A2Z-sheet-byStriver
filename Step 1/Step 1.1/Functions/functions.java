/*
 * Functions are the set of code which are doing something for you
 * Functions are use to modularise code
 * Functions are use to increase readablity
 * Functions are use to use same code multiple times
 * 
 * void --> which return nothing
 * return --> which return something
 * parameterised 
 * non-parameterised 
 *  
 */


// WAP that take 2 number as input and print there sum

import java.util.Scanner;

public class functions {
    
    static int sum(int n1,int n2)
    {
        int s=n1+n2;
        return s;
    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        int num1, num2;
        System.out.println("Enter num1");
        num1 = S.nextInt();
        System.out.println("Enter num2");
        num2 = S.nextInt();

        System.out.println("The sum is "+sum(num1,num2));


    }
}
