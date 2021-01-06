import java.util.Scanner;

public class GruhaVihara {
    String name;
    int days;
    double rent , amount;

    void inputData(){
        Scanner in = new Scanner(System.in);

        System.out.println("Type the name = ");
        name = in.next();

        System.out.println("Type the number of days = ");
        days = in.nextInt();

        System.out.println("Type the rent of one day = ");
        rent = in.nextDouble();
    }

    void calculate(){
        amount = days*rent;
    }

    void display(){
        System.out.println("Name \t Days \t Amount");
        System.out.println(name+""+days+""+amount);
    }

    public static void main(String args[]){
        GruhaVihara obj1 = new GruhaVihara();
        obj1.inputData();
        obj1.calculate();
        obj1.display();
    }
}
