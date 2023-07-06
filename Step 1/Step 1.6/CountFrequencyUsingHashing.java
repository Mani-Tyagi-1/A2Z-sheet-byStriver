//Given an array A[] of N positive integers which can contain integers from 1 to P where elements can be repeated or can be absent from the array. Your task is to count the frequency of all elements from 1 to N.
// Note: The elements greater than N in the array can be ignored for counting and do modify the array in-place.



import java.util.*;

public class CountFrequencyUsingHashing {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.println("Enter value of N");
        int n=S.nextInt();
        System.out.println("Enter value of P");
        int p=S.nextInt();
        System.out.println("Enter value of arr");
        int arr[] = new int[n];
        for (int i : arr) {
            arr[i] = S.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i:arr)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        for(int i=0,j=1;i<n;i++,j++)
        {
            if (map.containsKey(j))
            arr[i]=map.get(j);
            else
            arr[i]=0;
        }
        
        for (int i : arr) {
            System.out.print(arr[i]+" ");
        }
    }
}
pending