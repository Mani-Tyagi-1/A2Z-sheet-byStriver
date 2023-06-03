/*
 * Array 
 * An array is a collection of data which is of similar type.
 * Array Elements will be stored in contiguous memory locations.
 * You can declare a number of variables in a single line instead of declaring individually. Example: int arr[]= {1,2,10,20}; 
 * 
 */

import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int num1[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        for(int i=0;i<10;i++)
        {
            System.out.println(num1[i]);
        }
        
        //another way
        int num[] = new int[10];
        System.out.println("Enter numbers in array num");
        for(int i=0;i<10;i++)
        {
            num[i] = S.nextInt();
        }
        S.close();
        for(int i=0;i<10;i++)
        {
            System.out.println(num[i]);
        }
    }
}
