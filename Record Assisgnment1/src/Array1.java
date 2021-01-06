public class Array1 {
    public static void main(String args[]){
        double sum=0,avg;
        double a[] = {14.7, 15.2, 15.0, 14.2, 13.5, 12.4, 12.1};

        for(int i=0;i<7;i++){
            sum = sum + a[i];
        }
        avg = sum/7;
        System.out.println("The average of the program is : "+avg);
    }
}
