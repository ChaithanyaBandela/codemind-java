import java.util.*;
public class Lamps{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt(),x=sc.nextInt(),y=sc.nextInt();
        int costRedLamps=k*x;
        int remainingLamps=Math.min((n-k)*x,(n-k)*y);
        int tot=costRedLamps+remainingLamps;
        System.out.println(tot);
    }
}