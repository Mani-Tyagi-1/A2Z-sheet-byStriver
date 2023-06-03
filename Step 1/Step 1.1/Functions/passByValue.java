/*
 *  pass by valur send the copy of the value to the function so any changes made to the value not reflect in the original one
 */

public class passByValue {
    static void doSomething(int n)
    {
        System.out.println(n);
        n += 5;
        System.out.println(n);
        n += 5;
        System.out.println(n);
        n += 5;
        System.out.println(n);
    }
    public static void main(String[] args) {
        int num = 10;
        doSomething(num);
        System.out.println(num);
    }
}
