import java.util.*;
public class ReverseInteger{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n;
        if(n<0) n=n*-1;
        int re=0;
        int b=0;
        while(n!=0)
        {
            re=n%10;
            b=b*10+re;
            n=n/10;
        }
        if(t<0){
            System.out.println(b*-1);
        }
        else{
            System.out.println(b);
        }
    }
}