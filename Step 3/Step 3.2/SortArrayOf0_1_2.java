import java.util.ArrayList;
import java.util.Collections;

public class SortArrayOf0_1_2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(2);
        arr.add(1);
        arr.add(1);
        Collections.sort(arr);

        for(int i:arr)
        System.out.println(i);
        
    }
}
