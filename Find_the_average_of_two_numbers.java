import java.util.Scanner;
public class avg{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double a,b;
        a=sc.nextDouble();
        b=sc.nextDouble();
        double aver;
        aver=(a+b)/2;
        System.out.printf("%.4f",aver);
    }
}