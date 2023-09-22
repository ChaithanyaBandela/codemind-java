import java.util.*;
public class miss{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int k=sc.nextInt();
            int[] arr=new int[k];
            for(int j=0;j<k-1;j++)
            {
                arr[j]=sc.nextInt();
            }
            int s=0;
            for(int j=0;j<k-1;j++)
            {
                s+=arr[j];
            }
            int dig=k*(k+1)/2;
            System.out.println(dig-s);
        }
    }
}