package Regular_Expression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P4 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Your Name ");
        String name=scanner.nextLine();
        System.out.println("Enter Your Phone No ");
        String s1=scanner.next();

        Pattern p=Pattern.compile("[a-zA-Z]+?\\s[a-zA-Z]+?");
        Matcher m=p.matcher(name);
        if(m.matches()){
            System.out.println("Name > "+name);
        }

        if(Pattern.matches("\\d{10}",s1)){
            System.out.println("Mobile Number > "+s1);
        }

    }
}
