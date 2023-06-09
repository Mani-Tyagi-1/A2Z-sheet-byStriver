/*

stack --> (LIFO) -- Last In First Out


 */

import java.util.*;
import java.util.Stack;
public class LearnStack {
    public static void main(String[] args) {
        
        Stack<String> animals = new Stack<>();

        // Add element in the stack
        animals.push("Lion");
        animals.push("Tiger");
        animals.push("Horse");
        animals.push("Cat");
        System.out.println("Stack: " + animals);
        
        // peek --> to see the top most value that has been added
        System.out.println(animals.peek());
        
        // pop --> delete the top most element from stack
        animals.pop();
        System.out.println("After pop: "+animals.peek());
        System.out.println("Stack: " + animals);
    }
}
