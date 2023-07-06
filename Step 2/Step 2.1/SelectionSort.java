import java.util.Scanner;

public class SelectionSort {
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
            int min = i;
            for (int j = i; j < size; j++) {
                if (arr[min] > arr[j])
                    min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        
        for(int i=0;i<size;i++)
        System.out.print(arr[i]+" ");

    }
}
