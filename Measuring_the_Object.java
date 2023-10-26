import java.util.*;
public class MeasuringObject{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt(),x=sc.nextInt(),y=sc.nextInt(),z=sc.nextInt();
        System.out.println(w==x||w==y||w==z||w==(x+y)||w==(y+z)||w==(x+z)||w==(x+y+z)?"YES":"NO");
        
    }
}