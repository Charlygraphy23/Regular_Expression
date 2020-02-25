package Regular_Expression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P5 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any Statement  ");
        String s=scanner.nextLine();
        int c=0,w=0;

        String [] s1=s.split("\\s");
//        for(int i=0;i<s1.length;i++){
//            System.out.println(s1[i]);
//        }

        for(int i=0;i<s1.length;i++){
            Pattern p=Pattern.compile("[a-zA-Z]");
            Matcher m=p.matcher(s1[i]);

            while (m.find())
            {
                c++;
            }
            p=Pattern.compile("\\d");
            m=p.matcher(s1[i]);

            while (m.find())
            {
                w++;
            }
        }

        System.out.println("Alphabets Are > "+c);
        System.out.println("Digits Are > "+w);

    }
}
