
/*

Dynamically increase or decrease the size of the array

 */
import java.util.*;

public class array_List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); // Decleration
        
    //     // adding element at the end of the list
    //     list.add(1);
    //     list.add(2);
    //     list.add(3);
    //     list.add(4);
        
    //     list.add(2, 20); // add 20 at index 2
        
    //     ArrayList<Integer> newlist = new ArrayList<>(); 
    //     newlist.add(100);
    //     newlist.add(200);
    //     newlist.add(300);

    //     list.addAll(newlist); // adding whole list in the previous list
    //     System.out.println(list);



    // // Get methods -> return the element from the given index 
    // System.out.println(list.get(1));
    
    // // Set methods -> change the element of the given index 
    // list.set(3, 4000);
    // System.out.println(list);

    // // contains -> check whether it contain the given integer
    // System.out.println(list.contains(2));

    // // remove method
    // list.remove(2);
    // System.out.println("After removing = " + list);
    
    // list.remove(Integer.valueOf(200)); 
    // System.out.println("After removing = " + list);

    // list.clear();
    // System.out.println("Empty list = " + list);
    


    // traverse in arraylist
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
    list.add(50);
    list.add(60);

    System.out.println(list);

    for(int i=0;i<list.size();i++)
        System.out.println("The element is " + list.get(i));
    
    for (Integer element : list) {
        System.out.println("forEach element is " + element);
    }
    Iterator<Integer> it = list.iterator();

   while(it.hasNext())
   {
       System.out.println("Iterator " + it.next());
   }
    
   

    }    
}
