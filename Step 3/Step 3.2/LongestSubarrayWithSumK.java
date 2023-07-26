public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        
        int a[] = { 1, 2, 3, 1, 1, 1, 1 };
        int k = 3;
         int sum=0;
        int len=0;
        int maxlen=0;

        for(int i=0;i<a.length;i++)
        {
            sum = 0;
            for (int j = i + 1; j < a.length; j++) {
                sum += a[j];
                if (sum == k) {
                    len = j - i;
                    maxlen = Math.max(maxlen, len);
                }
            }
        }
        System.out.println(maxlen);
        // return maxlen;
    }
}
