import java.util.*;
public class col{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int R=sc.nextInt();
        int C=sc.nextInt();
        int[][] arr=new int[R][C];
        int max=0;
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<C;i++)
        {
            int c=0;
            for(int j=0;j<R;j++)
            {
                c+=arr[j][i];
            }
            if(c>max)
            {
                max=c;
            }
        }
        System.out.print(max);
    }
}