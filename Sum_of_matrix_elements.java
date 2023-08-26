import java.util.Scanner;
import java.util.Arrays;
public class sum{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int R=sc.nextInt();
        int C=sc.nextInt();
        int[][] arr=new int[R][C];
        int su=0;
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                arr[i][j]=sc.nextInt();
                su+=arr[i][j];
            }
        }
        System.out.print(su);
    }
}