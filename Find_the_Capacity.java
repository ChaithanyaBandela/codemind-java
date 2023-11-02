import java.util.*;
public class Capacity{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt(),s=sc.nextInt(),b=sc.nextInt();
        int cap=2*t*s*b*512;
        int byt=cap/1024;
        System.out.println(byt+"KB");
    }
}