import java.util.*;
public class diag{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int R=sc.nextInt(),C=sc.nextInt();
        int[][] arr=new int[R][C];
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int su=0;
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                if(i==j||i+j==R-1)
                {
                    su+=arr[i][j];
                }
            }
        }
         System.out.print(su);
    }
}