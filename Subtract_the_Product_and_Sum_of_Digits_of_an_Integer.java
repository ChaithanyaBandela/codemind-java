import java.util.*;
public class ub{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int su=0,pro=1;
        while(n>0)
        {
            int re=n%10;
            su+=re;
            pro*=re;
            n=n/10;
        }
        System.out.print(Math.abs(su-pro));
    }
}