import java.util.*;
public class WandaAndBread{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt(),k=sc.nextInt();
        int eatLoaves=m*k;
        if(n<=eatLoaves){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}