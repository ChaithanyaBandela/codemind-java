import java.util.*;
public class even{
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
        int evenSum=0;
        int oddSum=0;
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                if(arr[i][j]%2==0)
                {
                    evenSum+=arr[i][j];
                }
                else
                {
                    oddSum+=arr[i][j];
                }
            }
        }
        System.out.print(evenSum+" ");
        System.out.print(oddSum+" ");
    }
}