// You are given an array of size n. Move all zeros to last and all non zero number at start of the array

import java.util.Scanner;

public class MoveAllZeroToEnd {
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

        int temp[] = new int[size];

        int x=0;
        for(int i=0;i<size;i++)
        {
            if (arr[i] != 0) {
                temp[x] = arr[i];
                x++;
            }
        }
        
        
        while(x<=size-1)
        {
            temp[x]=0;
            x++;
        }


        for(int i=0;i<size;i++)
        System.out.print(temp[i]+" ");


    }
}
