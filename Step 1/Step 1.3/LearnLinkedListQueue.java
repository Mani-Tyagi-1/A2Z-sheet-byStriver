/*
Queue --> (FIFO) -- First in first out 

 */

import java.util.*;
public class LearnLinkedListQueue {
    public static void main(String[] args) {
        
        Queue<Integer> queue = new LinkedList<>();

    //   Adding element to the queue 
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        System.out.println(queue); 

        // poll --> It return as well as delete the very first element added in the queue
        System.out.println("Poll: " + queue.poll());

        System.out.println("After Poll: " + queue);
        
        //Peek --> next element that is to be deleted

        System.out.println(queue.peek());
        
            
    }
}
