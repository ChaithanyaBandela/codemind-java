import java.util.Scanner;
import java.util.Arrays;
public class arr{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=n/2;
        int b=1;
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        int max=0;
        for(int i=0;i<n;i++)
        {
            int cnt=0;
            for(int j=0;j<n;j++)
            {
                if(array[i]==array[j])
                {
                    cnt++;
                }
            }
            if(max<cnt)
            {
                max=cnt;
                b=array[i];
            }
        }
        System.out.print(b);
    }
}