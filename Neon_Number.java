import java.util.*;
public class neon{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int s=N*N;
        int su=0;
        while(s>0)
        {
            int re=s%10;
            su=su+re;
            s=s/10;
        }
        if(su==N)
        {
            System.out.print("Neon Number");
        }
        else{
            System.out.print("Not Neon Number");
        }
    }
}