import java.util.Scanner;

public class ArrayProg4 {
        public static void main(String args[])
        {
            Scanner in=new Scanner(System.in);
            int num[]=new int[10];
            int i, j, ctr;
            System.out.print("Enter numbers ");
            for(i=0;i<10;i++)
            {
                System.out.print("\nEnter number - "+(i+1)+" : ");
                num[i]=in.nextInt();
            }
            System.out.println("Composite numbers in the array are :");
            for(i=0;i<10;i++)
            {
                ctr=0;
                for(j=1;j<=num[i];j++)
                {
                    if(num[i]%j==0)
                        ctr++;
                }
                if(ctr>2)
                    System.out.println(num[i]);
            }
        }
    }

