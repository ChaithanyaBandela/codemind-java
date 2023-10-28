import java.util.*;
public class KohliAndCoins{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x%5!=0)
        {
            System.out.println("-1");
        }
        else if(x%10==0)
        {
            System.out.println(x/10);
        }
        else{
        System.out.println(1+(x-5)/10);
        }
    }
}