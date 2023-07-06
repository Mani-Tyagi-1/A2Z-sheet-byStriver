// print first n natural number

import java.util.*;
public class fibonacciNumber {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter number");
        int n = S.nextInt();
        S.close();
        int arr[] = new int[n];


        if(n>=1)
        arr[0]=1;
        if(n>=2)
        arr[1]=1;
        for(int i=2;i<n;i++)
        {
            // arr[i]=fibo(i+1);
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
