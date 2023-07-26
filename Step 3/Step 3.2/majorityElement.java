import java.util.Arrays;

public class majorityElement {
    public static void main(String[] args) {
        
        int v[] = { 2, 2, 1, 3, 1, 1, 3, 1, 1, };

        if (v.length == 1)
        {
            System.out.println(v[0]);
            return;
        }

        Arrays.sort(v);
        int max=0;
        int count=1;
        int temp=v[0];
        for(int i=0;i<v.length-1;i++)
        {
            if (v[i] == v[i + 1])
                count++;
            else
                count = 1;

            if (count > max) {
                max = count;
                temp = v[i];
            }
        }
        System.out.println(temp);
    }
}
