import java.util.*;
public class pair{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n/2;i++)
        {
            System.out.print(arr[i]+" "+arr[n-i-1]+" ");
        }
        if(n%2!=0)
        {
            System.out.print(arr[n/2]+" 0");
        }
    }
    
}