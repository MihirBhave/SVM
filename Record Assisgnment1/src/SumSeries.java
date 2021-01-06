import java.util.*;
class SumSeries
{
    public static long fact(int p)
    {
        long f=1;
        for(int i=1;i<=p;i++)
        {
            f=f*i;
        }
        return f;
    }
    public static void main(String args[])
    {
        Scanner kb=new Scanner(System.in);
        SumSeries ob=new SumSeries( );//ob is created, to invoke
        //instance method->fact(int p)
        int i, n, a;
        long f1;
        double nr, sum=0;
        System.out.println("Enter the Number of terms & the Value of a");
        n=kb.nextInt( );
        a=kb.nextInt( );
        for(i=1;i<=n;i++)
        {
            f1=ob.fact(i); //Denominator
            nr=(double)(a + (i-1)); //Numerator
            sum=sum+ nr/f1;
        }
        System.out.println("Sum of the series = "+sum);
    }
}
