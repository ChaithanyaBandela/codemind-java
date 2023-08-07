import java.util.Scanner;
public class disk{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int s,t,b;
        s=sc.nextInt();
        t=sc.nextInt();
        b=sc.nextInt();
        int c;
        c=2*s*t*b*512;
        System.out.printf("%d",c);
    }
}