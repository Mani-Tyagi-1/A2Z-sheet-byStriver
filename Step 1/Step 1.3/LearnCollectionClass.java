import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionClass {
    public static void main(String[] args) {
        
        List<Integer> li = new ArrayList<>();
        
        li.add(34);
        li.add(74);
        li.add(95);
        li.add(67);
        li.add(39);
        li.add(64);
        li.add(23);
        li.add(45);

        System.out.println(Collections.min(li));
        System.out.println(Collections.max(li));
        System.out.println(Collections.frequency(li, 34));
        
        Collections.sort(li);
        System.out.println(li);

        // reverse sort
        Collections.sort(li, Comparator.reverseOrder());
        System.out.println(li);

    }
}
