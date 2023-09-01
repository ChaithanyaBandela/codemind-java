import java.util.*;
public class hello{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Hello Technicalhub");
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i));
        }
    }
}