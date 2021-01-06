import java.util.Scanner;

public class Employee {
    double basic, da, hra, pf, gsal, nsal;
    String ename;

    void getDetails(){
        Scanner in = new Scanner(System.in);

        System.out.println("Type your name : ");
        ename = in.next();

        System.out.println("Type your basic pay : ");
        basic = in.nextDouble();
    }

    void calculate(){
        da = 0.35*basic;
        hra = 0.15*basic;
        pf = 0.12*basic;
        gsal = basic + da + hra;
        nsal = gsal - pf;
    }

    void display(){
        System.out.println("The name  = "+ ename);
        System.out.println("The GSAL = "+gsal);
        System.out.println("The NSAL = "+nsal);
    }

    public static void main(String args[]){
        Employee obj1 = new Employee();
        obj1.getDetails();
        obj1.calculate();
        obj1.display();
    }

}
