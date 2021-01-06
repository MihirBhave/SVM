import java.util.Scanner;

public class StaticProgram {
    static int reverse(int a){
        int d,result=0;
        while(a>0){
            d = a%10;
            result = (result*10)+ d;
            a=a/10;
        }
        return result;
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.println("Type a number = ");
        int number = in.nextInt();

        int reverseNumber = reverse(number);

        if(reverseNumber==number){
            System.out.println("The given number is a palindrome number .");
        }
        else{
            System.out.println("The number is not a palindrome number.");
        }
    }
}
