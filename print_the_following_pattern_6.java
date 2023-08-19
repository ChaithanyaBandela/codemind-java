import java.util.Scanner;
public class par{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),i,j;
        for(i=1;i<=n;i++)
        {
            for(j=n;j>0;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}