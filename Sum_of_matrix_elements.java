import java.util.*;
public class SumOfMatrix{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt(),n=sc.nextInt();
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int s=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                s+=arr[i][j];
            }
        }
        System.out.println(s);
    }
}