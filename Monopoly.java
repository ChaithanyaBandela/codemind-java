import java.util.*;
public class Monopoly{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int r1=sc.nextInt(),r2=sc.nextInt(),r3=sc.nextInt();
            System.out.println(r1>(r2+r3) || r2>(r1+r3) || r3>(r1+r2)? "YES" : "NO");
        }
    }
}