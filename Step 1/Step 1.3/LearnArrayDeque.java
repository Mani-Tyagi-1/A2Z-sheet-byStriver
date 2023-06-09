/*

We can add or remove element form both side and also peek element from both side

 */

import java.util.ArrayDeque;
public class LearnArrayDeque {
    public static void main(String[] args) {
        
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.add(20); // add by default at last of the queue
        adq.offerFirst(10);// add at front of the queue
        adq.offerLast(30); // add at last of the queue

        System.out.println(adq);

        System.out.println(adq.peek());  // by default next element to be deleted
        System.out.println(adq.peekFirst()); // at first
        System.out.println(adq.peekLast()); // at last

        System.out.println("Poll: "+adq.poll()); // by default 
        System.out.println("AfterPoll: " + adq); 
        
        System.out.println("PollFirst: "+adq.pollFirst()); //  delete first
        System.out.println("AfterPollFirst: " + adq);
        
        System.out.println("PollLast: "+adq.pollLast()); // delete last
        System.out.println("AfterPollLast: "+adq);
    }
}
