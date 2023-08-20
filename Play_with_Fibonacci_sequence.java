import java.util.Scanner;
public class fab{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),i,a=0,b=1,c;
        for(i=1;i<=n;i++)
        {
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}