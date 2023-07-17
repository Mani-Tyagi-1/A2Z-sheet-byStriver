public class SingleElement {
    public static void main(String[] args) {
        
        int arr[] = { 1, 1, 2, 3, 3, 4, 4 };

        if (arr.length == 1)
        {
            System.out.println(arr[0]);
            return ;
        }
        
        for(int i=1;i<arr.length-1;i++)
        {
            if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1])
            {
                System.out.println(arr[i]);
                return ;
            }
        }

        if (arr[arr.length - 1] != arr[arr.length - 2])
        {
            System.out.println(arr[arr.length-1]);
            return ;
        }

         System.out.println(-1);
    }
}
