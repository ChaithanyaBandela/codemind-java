import java.util.*;
public class DifferenceOfSums{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sumOfSquares=(n*(n+1)*(2*n+1))/6;
        int sumOfNat=n*(n+1)/2;
        int sq=sumOfNat*sumOfNat;
        System.out.println(Math.abs(sumOfSquares-sq));
    }
}