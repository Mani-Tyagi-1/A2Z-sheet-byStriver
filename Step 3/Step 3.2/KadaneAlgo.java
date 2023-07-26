public class KadaneAlgo {
    public static void main(String[] args) {
        
        int arr[] = {1, 2, 7, -4, 3, 2, -10, 9, 1};
        int n = arr.length;

        long max=arr[0];
		long sum=0L;

		for(int i=0;i<n;i++)
		{
			sum+=arr[i];
			if(sum<0)
			sum=0;
			if(sum>max)
			max=sum;
		}
		System.out.println(max);
    }
}
