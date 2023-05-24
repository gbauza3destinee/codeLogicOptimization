import org.w3c.dom.ls.LSOutput;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternMatcher {


    /**
     * Practice Problem 1: Write a Java program that matches a string
     * that has a p followed by zero or more q's.
     * -> Practiced Regex Expressions 3/24 !
     * @param s, a User provided String.
     * @return true or false
     */

    public static boolean isPatternMatching(String s) {

        Pattern pattern = Pattern.compile("[pq|p0]+");
        Matcher matcher = pattern.matcher(s);
        String regexPattern = "[pq | p0]+";

        if (s.contains(regexPattern)) {
            return true;
        }
        System.out.println(String.format("Pattern : %s was not found", regexPattern));
        return false;

    }

    // Code Solution Review:   if (text.matches("pq*?"))
    // String can use method .matches() for regex comparing.


    public static void main(String[] args) {


        boolean answer = isPatternMatching("abcdeflol");


        // TODO: Figure out how to satisfy out of scope


    }
}

