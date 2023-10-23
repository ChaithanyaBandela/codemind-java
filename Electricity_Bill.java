import java.util.*;
public class ElectricityBill{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Units Consumed: "+a);
        double b,c,d,tot;
        if(a<=199)
        {
            c=1.20;
            b=a*c;
        }
        else if(a>=200 && a<400)
        {
            c=1.40;
            b=a*c;
        }
        else if(a>=400 && a<600)
        {
            c=1.60;
            b=a*c;
        }
        else if(a>=600 & a<800)
        {
            c=1.80;
            b=a*c;
        }
        else{
            c=2.00;
            b=a*c;
        }
        System.out.printf("Cost per Unit: %.2f
",c);
        System.out.printf("Bill: %.2f
",b);
        if(a>400)
        {
            d=b*0.15;
            System.out.printf("Surcharge: %.2f
",d);
        }
        else{
            d=0;
            System.out.printf("Surcharge: %.2f
",d);
        }
        tot=b+d;
        System.out.printf("Total Amount: %.2f
",tot);
    }
}