import java.util.Scanner;

public class QuickSort {

    public static int partition(int arr[], int low, int high)
    {
        int pivot = arr[low];
        int i = low, j = high;

        while (i <= high && j >= low) {
            while (arr[i] <= pivot && i <= high-1)
                i++;

            while (arr[j] > pivot && j >= low+1)
                j--;

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[j];
        arr[j] = pivot;
        pivot = temp;

        return j;
    }


    public static void Quick_Sort(int arr[], int left, int right)
    {
        if(left>=right)
            return;
        int x = partition(arr, left, right);
        Quick_Sort(arr, left, x - 1);
        Quick_Sort(arr, x + 1, right);

    }

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

         System.out.println("Before sorting:");
        for (int i = 0; i < size;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        Quick_Sort(arr, 0, size - 1);

        System.out.println("Before sorting:");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }
}
