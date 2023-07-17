// search the given number in the array


public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 6, 7, 90, 3, 13 };
        int num = 7;
        int flag = 0;
         for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==num)
            {
                flag = i;
            }
        }
        // if(flag!=0)
            System.out.println(flag);


    }
}
