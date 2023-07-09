// Given an array 'arr' of size 'n'. Find the largest element in the array 

import java.util.Scanner;
import java.util.*;
public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
    
         System.out.println("Enter Size");
        int size=S.nextInt();

        System.out.println("Enter Array Element");
        int arr[] = new int[size];
        
        for(int i=0;i<size;i++)
        {
            arr[i] = S.nextInt();
        }
        S.close();

        Arrays.sort(arr);

        System.out.println("Second Largest Element"+arr[size-2]);

    }
}
