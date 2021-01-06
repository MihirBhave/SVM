public class CharMethods {
    public static void main(String args[]){
        char a = 'a';
        if(Character.isDigit(a)){
            System.out.println("The character is a digit.");
        }

        else if(Character.isLetter(a)){
            System.out.println("The character is a letter.");

            if(Character.isUpperCase(a)){
                System.out.println("The character is uppercase.");
                System.out.println("The lowercase of the character is : "+Character.toLowerCase(a));
            }

            else if(Character.isLowerCase(a)){
                System.out.println("The character is a lowercase.");
                System.out.println("The uppecase of the character is : "+Character.toUpperCase(a));
            }
        }

        System.out.println("The String of the above character is : "+Character.toString(a));



    }
}
