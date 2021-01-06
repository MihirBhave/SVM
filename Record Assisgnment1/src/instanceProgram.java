import java.util.Scanner;

public class instanceProgram {
    public int findBig(int x,int y){
        if(x>y){
            return x;
        }
        else if(x<y){
            return y;
        }

        else{
            return 0;
        }
    }

    public static void main(String args[]){
        Scanner in  = new Scanner(System.in);

        System.out.println("Type the first number : ");
        int a = in.nextInt();

        System.out.println("Type the second  number : ");
        int b = in.nextInt();

        instanceProgram obj1 = new instanceProgram();
        int result = obj1.findBig(a,b);

        if(result==a){
            System.out.println("The bigger number is = "+ a);
        }

        else if(result==b){
            System.out.println("The bigger number is = "+ b);
        }
        else{
            System.out.println("Both the numbers are equal.");
        }
    }
}
