import java.util.Scanner;

public class InsertionSort {
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

        for(int i=0;i<size;i++)
        {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        
        for(int i=0;i<size;i++)
        System.out.print(arr[i]+" ");
    }
}
