import java.util.*;
public class OddNaturalNum{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //int s=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
               System.out.print(i+" ");
            }
        }
    }
}