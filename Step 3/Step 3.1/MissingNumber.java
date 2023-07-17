// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int nums[] = { 3, 0, 1 };

        int flag = -1;
        Arrays.sort(nums);
        int n=nums.length;
        int j=0;
        int i=0;

        while(i<n && j<=n)
        {
            if (nums[i] != j)
                flag = j;
            // return j;
            j++;
            i++;
        }
        
        System.out.println(flag);

    }
}
