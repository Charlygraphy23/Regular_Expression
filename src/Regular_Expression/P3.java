package Regular_Expression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P3 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Link Of Websites ");
        String s=scanner.next();

        Pattern p=Pattern.compile("(http|https)://(w{3})\\.(\\S+?)\\.(co|com|org)");
        Matcher m=p.matcher(s);
        if(m.find()){
            System.out.println(m.group());
        }

    }
}
