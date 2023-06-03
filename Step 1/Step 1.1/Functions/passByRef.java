/*
 *  There are 3 ways to achieve pass by reference in java
 * 
 *  1. Make a particular variable of a particular datatype as a class member
 * 
 *  2. Passing collections or Single element array as parameter
 * 
 *  3.  Update the Return value (Naive approch) 
 */


 
//  1. Make a particular variable of a particular datatype as a class member 
public class passByRef {
    int number = 0;

    static void update(passByRef obj) // passing object as parameter
    {
        obj.number++;
    }
    
    public static void main(String[] args) {

        passByRef obj = new passByRef();
        System.out.println("The number is " + obj.number);
        update(obj);
        System.out.println("The updated number is " + obj.number);   
    }
    
}
