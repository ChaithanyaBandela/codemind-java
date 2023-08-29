import java.util.*;
public class fin{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),a=0,b=1,c,d=0;
        for(int i=0;i<=n;i++)
        {
            c=a+b;
            if(c==n)
            {
                d++;
                break;
            }
            a=b;
            b=c;
        }
        if(d==0)
        {
            System.out.print("False");
        }
        else
        {
            System.out.print("True");
        }
    }
}