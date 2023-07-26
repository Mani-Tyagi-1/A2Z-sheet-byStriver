public class AlternateNumbers {
    public static void main(String[] args) {

        int a[] = { 1, 2, -4, -5 };
        

         int neg[]=new int[a.length/2];
        int pos[]=new int[a.length/2];
        int res[]=new int[a.length];

        int x=0,y=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<0)
            neg[x++]=a[i];
            else
            pos[y++]=a[i];
        }
        x=0;
        y=0;
        for(int i=0;i<a.length;i++)
        {
            res[i] = pos[y++];
            res[++i] = neg[x++];
        }
        
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
}
