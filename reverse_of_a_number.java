import java.util.*;
public class rev{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rem,re=0;
        while(n>0)
        {
            rem=n%10;
            re=re*10+rem;
            n=n/10;
        }
        System.out.print(re);
    }
}