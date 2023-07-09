import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

         System.out.println("Enter Size");
        int size=S.nextInt();

        System.out.println("Enter Array Element");
        int arr[] = new int[size];
        
        for(int i=0;i<size;i++)
        {
            arr[i] = S.nextInt();
        }
        S.close();

        
        int count;
        if(size>0)
        count=1;
        else
        count =1;
        for(int i=0;i<size-1;i++)
        {
            if (arr[i] != arr[i + 1])
                count++;
        }
        
        System.out.println("The size of the new array is "+count);

    }
}
