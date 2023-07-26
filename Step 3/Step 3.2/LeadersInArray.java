import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {
    public static void main(String[] args) {

        int a[] = {1,2,3,2};
        

        List<Integer> li=new ArrayList<>();
        int max=a[a.length-1];
        li.add(max);

        for(int i=a.length-2;i>=0;i--)
        {
            if (a[i] > max) {
                li.add(a[i]);
                max = a[i];
            }
        }
        
        for(int i=0;i<li.size();i++)
        System.out.print(li.get(i)+" ");
    }
}
