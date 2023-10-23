import java.util.*;
public class BlackJack{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        if((a+b)<=10)
        {
            System.out.println("-1");
            
        }
        else{
            System.out.println(21-(a+b));
        }
    }
}