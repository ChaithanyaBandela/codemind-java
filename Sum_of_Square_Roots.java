import java.util.*;
public class SumOfSquareRoot{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        double s=0;
        for(int i=a;i<=b;i++)
        {
            s+=Math.sqrt(i);
        }
        System.out.printf("%.2f",s);
    }
}