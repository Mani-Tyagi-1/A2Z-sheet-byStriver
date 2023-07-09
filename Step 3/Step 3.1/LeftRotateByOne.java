// You are given a array of size n and you have to rotate the array by one

import java.util.Scanner;

public class LeftRotateByOne {
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

        int temp = arr[0];

        for(int i=0;i<size-1;i++)
        {
            arr[i] = arr[i + 1];
        }
        arr[size - 1] = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
