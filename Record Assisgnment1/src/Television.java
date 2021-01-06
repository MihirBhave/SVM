import java.util.Scanner;

public class Television {
    char model;
    double cost, newcost;
    Television( )
    {
        model='\u0000';
        cost=0.0;
    }
    Television(char m, double c)
    {
        model=m;
        cost=c;
    }
    void getValues( )
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter TV model in capital letter-> A/B/C and cost");
        model=in.next( ).charAt(0);
        cost=in.nextDouble( );
    }
    void compute( )
    {
        if(model=='A')
            newcost=cost + 8.5/100*cost;
        else if(model=='B')
            newcost=cost + 9.5/100*cost;
        else if(model=='C')
            newcost=cost + 11.5/100*cost;
    }
    void display( )
    {
        System.out.println("\nTelevision Model = "+model);
        System.out.println("Cost = "+cost);
        System.out.println("New cost = "+newcost);
    }
    public static void main(String args[])
    {
        //Default constructor
        Television TV1=new Television();
        TV1.getValues( );
        TV1.compute( );
        TV1.display( );

        //Parameterized constructor
        Scanner x=new Scanner(System.in);
        System.out.println("Enter TV model in capital letter-> A/B/C and cost");
        char m1=x.next().charAt(0);
        double c1=x.nextDouble( );

        Television TV2=new Television(m1, c1);
        TV2.compute( );
        TV2.display( );
    }

}
