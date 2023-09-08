import java.util.*;
public class spy{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int su=0,pro=1;
        while(N>0)
        {
            int rem=N%10;
            su=su+rem;
            pro=pro*rem;
            N=N/10;
        }
        if(su==pro)
        {
            System.out.print("Spy Number");
        }
        else{
            System.out.print("Not Spy Number");
        }
    }
}