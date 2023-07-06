import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.println("Enter size of array");
        int size = S.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter array element");
        for(int i=0;i<size;i++)
        {
            arr[i] = S.nextInt();
        }
        S.close();

        for(int i=size-1;i>=0;i--)
        {
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
         for(int i=0;i<size;i++)
        System.out.print(arr[i]+" ");
    }
}
