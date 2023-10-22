import java.util.*;
public class Natural{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n*2;i>0;i--)
        {
            if(i%2==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}