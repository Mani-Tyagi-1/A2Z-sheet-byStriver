// You are given a array of size n and you have to rotate the array by d elements

import java.util.Scanner;

public class LeftRotateByD {
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

        System.out.println("No. of elemnt you want to rotate");
        int k = S.nextInt();

        S.close();


        int temp[] = new int[k];

		for(int i=0;i<k;i++)
		temp[i]=arr[i];

		for(int i=0;i<size-k;i++)
		arr[i]=arr[i+k];

		for(int i=0;i<k;i++)
		arr[size-k+i]=temp[i];

		for(int i=0;i<size;i++)
		System.out.print(arr[i]+" ");
    }
}
