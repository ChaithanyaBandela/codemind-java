import java.util.*;
public class colSumMatrix{
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
        for(int i=0;i<C;i++)
        {
            int su=0;
            for(int j=0;j<R;j++)
            {
                su+=arr[j][i];
            }
             System.out.print(su+" ");
        }
    }
}