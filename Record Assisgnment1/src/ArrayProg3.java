import java.util.Scanner;

public class ArrayProg3 {
    public static void main(String args[]){
        int i=0;
        double[] num = new double[10];
        double[] sqroot = new double[10];
        double[] cbroot = new double[10];

        Scanner in = new Scanner(System.in);
        for(i=0;i<10;i++){
            System.out.println("Type number  "+num[i]);
            num[i] = in.nextInt();
         if(i<5){
             sqroot[i] = Math.sqrt(num[i]);
         }
         if(i>=5){
             cbroot[i] = Math.cbrt(num[i]);
         }
        }

        System.out.println("Square root");
        System.out.println("No \t \t Square root");
        for(i=0;i<5;i++){
            System.out.println(num[i]+"\t \t \t \t"+sqroot[i]);
        }

        System.out.println("Cube root");
        System.out.println("No \t \t Cube root");
        for(i=0;i>=5;i++){
            System.out.println(num[i]+"\t \t \t \t"+cbroot[i]);
        }

    }
}
