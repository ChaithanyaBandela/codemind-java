import java.util.Scanner;
public class bill{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        double b,c;
        if(a<=199)
        {
            b=a*1.20;
        }
        else if(a>=200 && a<400)
        {
            b=a*1.50;
        }
        else if(a>=400 && a<600)
        {
            b=a*1.80;
        }
        else
        {
            b=a*2.00;
        }
        if(b>400)
        {
            c=b+(b*0.15);
        }
        else
        {
            c=b+100;
            
        }
        System.out.printf("%.2f",c);
    }
}