import java.util.*;
public class mat{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int R=sc.nextInt(),C=sc.nextInt(),i,j;
        int[][] arr=new int[R][C];
        for(i=0;i<R;i++)
        {
            for(j=0;j<C;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int su=0;
        for(i=0;i<R;i++){
            for(j=0;j<C;j++){
                su+=arr[i][j];
            }
        }
        System.out.print(su);
    }
}