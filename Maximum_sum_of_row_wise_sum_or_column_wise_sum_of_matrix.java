import java.util.*;
public class rowColSum{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int R=sc.nextInt(),C=sc.nextInt();
        int[][] arr=new int[R][C];
        int max=0;
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<R;i++)
        {
            int s=0;
            for(int j=0;j<C;j++)
            {
                s+=arr[i][j];
            }
            if(s>max)
            {
                max=s;
            }
        }
        for(int i=0;i<C;i++)
        {
            int s=0;
            for(int j=0;j<R;j++)
            {
                s+=arr[j][i];
            }
            if(s>max)
            {
                max=s;
            }
        }
        System.out.print(max);
    }
}