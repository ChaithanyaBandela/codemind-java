import java.util.*;
public class Sum{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt(),B=sc.nextInt(),x=sc.nextInt(),y=sc.nextInt();
        int sum=0;
        for(int i=A;i<=B;i++)
        {
            if(i%x==0 && i%y!=0)
            {
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}