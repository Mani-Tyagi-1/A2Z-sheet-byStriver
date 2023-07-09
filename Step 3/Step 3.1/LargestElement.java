// Given an array 'arr' of size 'n'. Find the largest element in the array 

import java.util.Scanner;

public class LargestElement {
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

         int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if (arr[i] > max)
                max = arr[i];

        }
        
        System.out.println("Largest Element:"+max);
    }
}
