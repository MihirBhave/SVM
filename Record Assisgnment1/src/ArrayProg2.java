import java.util.Scanner;

public class ArrayProg2 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.println("The number of students.");
        int n = in.nextInt();

        double sum=0,avg,deviation=0;
        double totalMarks[] = new double[n];
        String name[] = new String[n];

        for(int i=0;i<n;i++){
            System.out.println("Total Marks of the "+(i+1)+" student");
            totalMarks[i] = in.nextDouble();
            System.out.println("Name of the "+(i+1)+" student");
            name[i] = in.next();
        }

        for(int i=0;i<n;i++){
            sum = sum + totalMarks[i];
        }
        avg = sum/n;
        System.out.println("The average = "+avg);

        for(int i=0;i<n;i++){
            deviation = totalMarks[i] - avg;
            System.out.println("The deviation of "+name[i]+" is "+deviation);
        }
    }
}
