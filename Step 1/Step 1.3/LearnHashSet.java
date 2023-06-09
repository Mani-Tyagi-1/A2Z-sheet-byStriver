/*
 Hashset Follow set --> doesn't allow duplicate element  

 linkedHashSet --> have almost same properties of set including the properties of the linkedList 

 TreeSet --> have almost same properties but it work in sorted order



 */

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnHashSet {
    public static void main(String[] args) {
        
        Set<Integer> set = new HashSet<>();
        
        
        // add element in set
        set.add(34);
        set.add(34);
        set.add(100);
        set.add(34);
        set.add(48);
        set.add(34);
        System.out.println(set);

        // remove 
        set.remove(100);
        System.out.println("After remove" + set);
        
        //conatins --> check weather set contain the given element 
        System.out.println(set.contains(34));

        //isEmpty --> check weather the given set is empty or not 
        System.out.println(set.isEmpty());
        
        //size --> return the number of element present in the set
        System.out.println(set.size());
        
        // clear --> remove all element form the set
        set.clear();
        System.out.println(set);
        

        Set<Integer> L_set = new LinkedHashSet<>();
        // add element in set
        L_set.add(34);
        L_set.add(34);
        L_set.add(100);
        L_set.add(34);
        L_set.add(48);
        L_set.add(34);
        System.out.println(L_set);

        // remove 
        L_set.remove(100);
        System.out.println("After remove" + L_set);
        
        //conatins --> check weather set contain the given element 
        System.out.println(L_set.contains(34));

        //isEmpty --> check weather the given set is empty or not 
        System.out.println(L_set.isEmpty());
        
        //size --> return the number of element present in the set
        System.out.println(L_set.size());
        
        // clear --> remove all element form the set
        L_set.clear();
        System.out.println(L_set);


        Set<Integer> T_set = new TreeSet<>();
        T_set.add(34);
        T_set.add(34);
        T_set.add(100);
        T_set.add(34);
        T_set.add(48);
        T_set.add(56);
        T_set.add(78);
        T_set.add(98);
        T_set.add(33);
        System.out.println(T_set);

        // hold all other properties given above

    }
}
