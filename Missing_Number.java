import java.util.*;
public class miss{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n-1;i++)
        {
            arr[i]=sc.nextInt();
        }
        int s=0;
        for(int i=0;i<n-1;i++)
        {
            s+=arr[i];
        }
        int dig=n*(n+1)/2;
        System.out.print(dig-s);
    }
}