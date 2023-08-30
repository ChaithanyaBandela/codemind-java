import java.util.*;
public class pal{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),i;
        for(i=0;i<n;i++)
        {
            int a=sc.nextInt();
            int j,rem,re=0;
            j=a;
            while(a>0)
            {
                rem=a%10;
                re=re*10+rem;
                a=a/10;
            }
            if(re==j){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }
    }
}