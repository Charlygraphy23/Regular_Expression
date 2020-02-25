package Regular_Expression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P2 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter DOU in Form DD/MM/YYYY or D/M/YYYY");
        String s=scanner.next();

        Pattern p=Pattern.compile("(0?[1-9]|[12]\\d|3[01])/(0?[1-9]|[12][0-9])/((19|20)\\d\\d)");
        Matcher m=p.matcher(s);
        if(m.find()){
            System.out.println(m.group(1));
            System.out.println(m.group(2));
            System.out.println(m.group(3));
        }

    }
}
