/*

Is used to do manipulation on array

 */
import java.util.Arrays;
public class LearnArrayClass {
    public static void main(String[] args) {
        
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // Binary search -> work on sorted array
        int index = Arrays.binarySearch(a, 4);
        System.out.println("The index of element 4 is " + index);

        //sort 
        int b[] = { 23, 45, 2, 47, 98, 43, 22, 66, 37 };
        Arrays.sort(b);
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i] + " ");
        }
        
        Arrays.fill(a, 12); // fill 12 at all places in the given array
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
        


    }
}
