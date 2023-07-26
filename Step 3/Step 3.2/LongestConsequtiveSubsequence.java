import java.util.HashSet;
import java.util.Set;

public class LongestConsequtiveSubsequence {
    public static void main(String[] args) {

        int a[] = {5,8,3,2,1,4};
        

        Set<Integer> set=new HashSet<>();

        for(int i=0;i<a.length;i++)
        {
            set.add(a[i]);
        }

        int largest=0;

        for(int i=0;i<a.length;i++)
        {
            if (!set.contains(a[i] - 1)) {
                int currNum = a[i];
                int currCount = 1;

                while (set.contains(currNum + 1)) {
                    currNum += 1;
                    currCount += 1;
                }
                largest = Math.max(largest, currCount);
            }
        }
        
        System.out.println(largest);
    }
}
