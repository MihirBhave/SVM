import java.util.Scanner;

public class Library {
    String bname,sname;
    double fine;
    int days;

    public Library(){
        bname = "";
        sname = "";
        fine = 0.0;
        days = 0;
    }

    void getData(){
        Scanner in = new Scanner(System.in);

        System.out.println("The book name : ");
        bname = in.next();

        System.out.println("The student name : ");
        sname = in.next();

        System.out.println("The number of days : ");
        days = in.nextInt();
    }

    void calFine(){
        if(days<=7){
            fine = days * 0.5;
        }

        else if(days>7 && days<=15){
            fine = days-7*0.75;
        }

        else if(days>15){
            fine =days-15*1;
        }
    }

    void display(){
        System.out.println("The student name = "+sname);
        System.out.println("The book name = "+bname);
        System.out.println("The fine to be paid = "+fine);
    }

    public static void main(String args[]){
        Library obj1 = new Library();
        obj1.getData();
        obj1.calFine();
        obj1.display();
    }

}
