import java.util.Scanner;

public class GruhaVihara {
    String name;
    int days;
    double amount;

    void inputData(){
        Scanner in = new Scanner(System.in);

        System.out.println("Type the name = ");
        name = in.next();

        System.out.println("Type the number of days = ");
        days = in.nextInt();
    }

    void calculate(){

        if(days<=3)
            amount=days*2000;

        else if(days>3 && days<=6)
            amount = 6000 + (days-3)*1600;

        else if(days>6 && days<=6)
            amount = 6000 + 4800 + (days-6)*1200;

        else if(days>9)
            amount = 6000 + 4800 + 3600 + (days-9)*800;


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
