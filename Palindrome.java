import java.util.*;
public class pal{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        i=n;
        int rem,re=0;
        while(n>0)
        {
            rem=n%10;
            re=re*10+rem;
            n=n/10;
        }
        if(re==i){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
}