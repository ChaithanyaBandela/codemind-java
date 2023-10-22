import java.util.*;
public class CntMultiples{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt(),n=sc.nextInt();
        int cnt=0;
        for(int i=m;i<=n;i++)
        {
            if(i%3==0)
            {
                cnt+=1;
            }
        }
        System.out.println(cnt);
    }
}