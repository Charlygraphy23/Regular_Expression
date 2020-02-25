package Regular_Expression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Word");
        String s=sc.next();
        if(s.length()>3)
            System.out.println("Word Should be 3 charrecter");
        else {
            Pattern p = Pattern.compile("[abc]at");
            Matcher m = p.matcher(s);
            if (m.find()) {
                System.out.println(m.group() + " Exception Found");
            }
        }

    }
}
