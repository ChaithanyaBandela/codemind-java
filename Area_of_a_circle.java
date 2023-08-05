import java.util.Scanner;
public class are{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int r;
        r=sc.nextInt();
        double  doubleVar=3.14,area;
        area=3.14*r*r;
        System.out.printf("%.2f",area);
        sc.close();
    }
}