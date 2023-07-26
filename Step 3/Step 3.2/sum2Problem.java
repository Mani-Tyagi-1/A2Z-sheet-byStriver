public class sum2Problem {
    public static void main(String[] args) {

        int book[] = { 4, 1, 2, 3, 1 };
        int n = book.length;
        int target = 5;
        
        for(int i=0;i<n-1;i++)
        {
            for (int j = 1; j < n; j++) {
                if (book[j] + book[i] == target) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("Yes");

    }
}
