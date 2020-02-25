package Regular_Expression;

import java.util.Scanner;
import java.util.regex.Pattern;

public class P6 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter User Email > ");
        String email=sc.next();
        System.out.println("Enter User Password > ");
        String pass=sc.next();

        boolean isValidEmail=false;
        boolean isValidPass=false;

        if(Pattern.matches("(\\S+?)@(\\S+?)\\.(com|co)",email)){
            isValidEmail=true;
        }
        else isValidEmail=false;
        if(Pattern.matches("\\w+",pass)){
            isValidPass=true;
        }
        else isValidPass=false;

        if(isValidEmail==true && isValidPass==true){
            System.out.println("User Valid");
        }
        else System.out.println("User Is not Valid");
    }
}
