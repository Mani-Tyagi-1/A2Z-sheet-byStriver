// 3.  Update the Return value (Naive approch)

public class passByRef2 {
    static int update(int n)
    {
        return ++n;
    }
    public static void main(String[] args) {
        int a=0;
        System.out.println("The value is " + a);
        a=update(a);
        System.out.println("The value is " + a);
    }    
}
