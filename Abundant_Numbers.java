import java.util.*;
public class abundant{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i,su=0;
        for(i=1;i<a;i++)
        {
            if(a%i==0)
            {
                su+=i;
            }
        }
        if(su>a)
        {
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
}