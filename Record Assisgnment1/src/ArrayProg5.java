import java.util.Scanner;

public class ArrayProg5 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int[] num = new int[10];
        int query,i=0;

        for(i=0;i<10;i++){
            System.out.println("Type number "+(i+1));
            num[i] = in.nextInt();
        }

        System.out.println("Type the number to be searched : ");
        query = in.nextInt();

        for(i=0;i<10;i++){
            if(num[i] == query){
                System.out.println("Search successful! The number is found at position "+(i+1));
                System.exit(0);
            }
        }
        System.out.println("Search Unsuccessful!");
    }
}
