//   2 sorted arrays are given return the sorted union of the arrays

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import java.util.Set;

public class unionOfArrays {
    public static void main(String[] args) {

        
        int a[] = { 1, 2,3, 4, 6 };
        int b[] = { 2, 3, 5 };

        Set<Integer> set = new HashSet<>();
        List<Integer> union = new ArrayList<>();

        int i = 0; // Pointer for array A
        int j = 0; // Pointer for array B

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                set.add(a[i++]);
            } else if (a[i] > b[j]) {
                set.add(b[j++]);
            } else {
                set.add(a[i++]);
                j++;
            }
        }

        while (i < a.length) {
            set.add(a[i++]);
        }

        while (j < b.length) {
            set.add(b[j++]);
        }

        union.addAll(set);
        Collections.sort(union);

        for(int p=0;p<union.size();p++)
            System.out.print(union.get(p) + " ");


    }
}
