import java.util.Scanner;
public class pa{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),i,j;
        for(i=n;i>0;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print((char)(64+i)+" ");
            }
            System.out.println();
        }
    }
}