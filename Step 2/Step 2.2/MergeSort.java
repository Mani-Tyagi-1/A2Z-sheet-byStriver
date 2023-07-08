import java.util.Scanner;

public class MergeSort {

    public static void merge(int arr[],int l,int m,int r){
        int n1 = m - l+1;
        int n2 = r - m;

        int left[] = new int[n1];
        int right[] = new int[n2];

        for(int i=0;i<n1;i++)
        {
            left[i] = arr[l + i];
        }
        for(int i=0;i<n2;i++)
        {
            right[i] = arr[m + 1 + i];
        }
        
        int i = 0, j = 0, k = l;

        while(i<n1 &&j<n2)
        {
            if(left[i]<right[j])
            {
                arr[k] = left[i];
                i++;
            }
            else
            {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while(i<n1)
        {
            arr[k]=left[i];
            k++;
            i++;
        }

        while(j<n2)
        {
            arr[k]=right[j];
            j++;
            k++;
        }


    }

    public static void merge_Sort(int arr[],int l,int r)
    {
        if(l>=r)
            return;
        int mid = (l + r) / 2;

        merge_Sort(arr, l, mid);
        merge_Sort(arr, mid + 1, r);
        merge(arr, l, mid, r);

    }

    public static void main(String[] args) {
        Scanner S   = new Scanner(System.in);
        
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
        MergeSort.merge_Sort(arr, 0, size - 1);

        System.out.println("After sorting:");

        for (int i = 0; i < size;i++) {
            System.out.print(arr[i]+" ");
        }
        

    }
}
