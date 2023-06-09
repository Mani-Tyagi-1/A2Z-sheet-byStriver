/*

Priority Queue --> Like queue but some priority is given to the element. 
Min heap 

 */

import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(4);
        pq.offer(1);
        pq.offer(8);
        pq.offer(5);

        System.out.println(pq);
        
        System.out.println("Poll: "+pq.poll()); // delete the smallest element among the queue --> priority is given to the smallest element
        System.out.println("After poll: " + pq);
        
        //Peek --> next element that is to be deleted
        System.out.println(pq.peek());


        // By using comparator it give priority to the largest element in the queue
        PriorityQueue<Integer> rev_pq = new PriorityQueue<>(Comparator.reverseOrder());
        rev_pq.offer(4);
        rev_pq.offer(1);
        rev_pq.offer(8);
        rev_pq.offer(5);
        System.out.println(rev_pq);

    }
}
