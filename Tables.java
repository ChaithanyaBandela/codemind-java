import java.util.*;
public class tab{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                System.out.printf("%d x %d = %d
",a,i,a*i);
            }
        }
    }
}