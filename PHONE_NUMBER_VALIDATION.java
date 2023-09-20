import java.util.*;
public class phn{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if(s.charAt(0)=='0')
        {
            System.out.print("Invalid");
        }
        else if(s.length()!=10)
        {
            System.out.print("Invalid");
        }
        else
        {
            System.out.print("Valid");
        }
    }
}