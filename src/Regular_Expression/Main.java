package Regular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String t="<h1> This is not Good </h1>";
        Pattern p=Pattern.compile("h1");
        Matcher m=p.matcher(t);
        if(m.find()) {
            System.out.println(m.replaceAll("p"));
        }
    }
}
