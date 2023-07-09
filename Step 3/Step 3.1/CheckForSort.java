// Check if the entered is sorted or not

import java.util.Scanner;

public class CheckForSort {
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

        int flag=0;
        for(int i=0;i<size-2;i++)
        {
            if (arr[i] > arr[i + 1]) {
                flag = 1;
                break;
            }
        }
        if(flag==1)
            System.out.println("Not a sorted array");
        else
            System.out.println("This is a sorted array");

    }
}
