import java.util.*;
public class HermoineAndSpells{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        if(a>b && c>b)
        {
            System.out.println(a+c);
        }
        else if(b>a && c>a)
        {
            System.out.println(b+c);
        }
        else
        {
            System.out.println(a+b);
        }
    }
}