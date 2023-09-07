import java.util.*;
public class reve{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            int rem,re=0;
            while(arr[i]>0)
            {
                rem=arr[i]%10;
                re=re*10+rem;
                arr[i]=arr[i]/10;
            }
            System.out.print(re+" ");
        }
    }
}