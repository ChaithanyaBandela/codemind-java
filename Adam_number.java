import java.util.*;
public class adam{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=a*a;
        int rem,re=0,i=a,c;
        while(a>0)
        {
            rem=a%10;
            re=re*10+rem;
            a=a/10;
        }
        c=re*re;
        int s=0,r;
        while(c>0)
        {
            r=c%10;
            s=s*10+r;
            c=c/10;
        }
        if(s==b)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}