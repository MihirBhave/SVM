public class OverloadProg2 {
    void num_calc(int num,char ch){
        if(ch=='s')
            System.out.println("The square = "+(num*num));
        else
            System.out.println("The cube = "+(num*num*num));
    }

    void num_calc(int a,int b,char ch){
        if(ch=='p'){
            System.out.println(a+b);
        }
        else
            System.out.println(a*b);
    }

    void num_calc(String s1, String s2){
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("The Strings are equal.");
        }
        else
            System.out.println("The Strings are'nt equal.");
    }
}
