import java.util.StringJoiner;

public class TimeConversion {




    // TODO : Review my Optimized Version with Swastik + Errors for future problems
    // Day 3 of Studying / Working Solutions for Studying Math + Conversion Logic Problems.

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here

        // 1. First write example input to create strategy around indices /format if possible
        // Example Input: 07:05:45PM 7 indices before AM/PM
        //                0123456789
        int hour = Integer.parseInt(s.substring(0,2));

        String minutes = s.substring(3,8); // check counting on this

        String dayTime = s.substring(8,10);

        // 2. Bracket out & Alter EdgeCases(every number after 12 in pms) to perform number altering
        // 2. It's not just numbers but time of day that should trigger alterations

        // TODO: What is the correct way to add in a ternary operator  statement
        // TODO: * since I can't write "if (dayTime.equals("PM") && hour == 12)"  I wanted a shortcut

        if (dayTime.equals("PM")){

           // TODO: Ternary Operator Attempt 2
            (hour > 12) ? hour += 12;

            // TODO: Ternary Operator Attempt 1
            if (hour > 12 ) : hour += 12;
        } else if (dayTime.equals("AM")) {
            if (hour == 12) : hour = 0;
        }

        String result = hour + minutes;


        //3. Formatting Edits for Output -- delete Pm/AM
        // in this case I opted out of

        return result;


    }


    /**
     * Simplified and optimized code that splices the "tiem" as a String value by index
     * @param s takes in an unknown String- one we can use the example for to count indices
     * @return an updated Military Time of the provided Sttring
     */


    // TODO: Review In what UseCases is it helpful to Use Modulo % ?
    // TODO: Tip from this Optimized Code - we can set a variable while doing math on it in 1 line

    public static String timeConversionSolution(String s){

            int hour = Integer.parseInt(s.substring(0, 2)) % 12;
            if (s.endsWith("PM"))
                hour += 12;
            return String.format("%02d", hour) + s.substring(2, 8);

    }




    public static void main(String[] args) {
        String s = "07:05:45PM";
        timeConversion(s);

    }







}
