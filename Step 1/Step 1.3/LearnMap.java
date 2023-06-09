/*
It is used to to store key value pair 
Keys must be unique
value may or may not be unique
 */

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {
    public static void main(String[] args) {
        /*  Map<String, Integer> numbers = new HashMap<>();
        
        // add keys and value to the map
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);
        
        numbers.putIfAbsent("Two", 23); // doesn't override the value
        System.out.println(numbers);
        
        // contains
        System.out.println(numbers.containsKey("Three"));
        System.out.println(numbers.containsValue(2));
        
        // isEmpty
        System.out.println(numbers.isEmpty());
        
        //remove
        System.out.println(numbers.remove());
        

        
        //clear
        // numbers.clear();
        // System.out.println(numbers);
        
        
        //Iterate through map
        for (Map.Entry<String, Integer> e : numbers.entrySet()) {
            // System.out.println(e); // return both keys and value
            // System.out.println(e.getKey()); // return keys only
            System.out.println(e.getValue()); // return values only
        }
            */

        // arrange in sorted order based on keys
        Map<String, Integer> T_numbers = new TreeMap<>();
        T_numbers.put("One", 1);
        T_numbers.put("Two", 2);
        T_numbers.put("Three", 3);
        T_numbers.put("Four", 4);
        System.out.println(T_numbers);
                
        // all other function written above
    }


    }

