import java.util.*;
public class largest{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),a,b,c,d;
        a=n%10;
        b=(n/10)%10;
        c=(n/100)%10;
        d=n/1000;
        if(a>b && a>c && a>d)
        {
            System.out.print(a);
        }
        else if(b>a && b>c && b>d)
        {
            System.out.print(b);
        }
        else if(c>a && c>b && c>d)
        {
            System.out.print(c);
        }
        else{
            System.out.print(d);
        }
    }
}