import java.util.Scanner;

public class BubbleSort {
        public static void main(String args[])
        {
            Scanner in=new Scanner(System.in);
            int a[]=new int[5];
            int i, j, temp;
            System.out.println("Enter 5 integers");
            for(i=0;i<5;i++)
            {
                a[i]=in.nextInt();
            }
            System.out.println("Array before sorting");
            for(i=0;i<5;i++)
            {
                System.out.print(a[i]+" ");
            }
            for(i=0;i<4;i++) // Test expression can be i<5
            {
                for(j=0;j<4-i;j++)
                {
                    if(a[j]>a[j+1])
                    {
                        temp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;
                    }
                }
            }
            System.out.println();
            System.out.println("Array elements after sorting in ascending order");
            for(i=0;i<5;i++)
            {
                System.out.print(a[i]+" ");
            }
        }
    }

