// 2. Passing collections or Single element array as parameter

public class passByRef1 {
    static void update(int a[])
    {
        a[0]++;
    }
    public static void main(String[] args) {
        int a[] = new int[1];
        a[0] = 0;
        System.out.println("The value is " + a[0]);
        update(a);
        System.out.println("The value is " + a[0]);
    }    
}
