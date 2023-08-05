import java.util.Scanner;
public class hand{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=(int)a*(a-1)/2;
        System.out.printf("%d",b);
    }
}