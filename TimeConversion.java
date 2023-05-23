import java.util.StringJoiner;

public class TimeConversion {




    /* Attempt OG Version 0000!
     * HackerRank Solving & Analyzing OG Code Solution
     * Instructions: Complete the 'timeConversion' function below.
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {


        String[] inputVals = s.split(":", 3);

        inputVals[1] = hourValue;
        //TODO: L18 missing int value when referencing an array

        int hourValue = Integer.parseInt(hourValue);

        int hourValue = Parse.int(hourValue);
        //TODO: L23 Wrong format of Integer.parseInt() method - review special case


        for(String val : inputVals){

            if (val.equals("PM")){


                if (hourValue>= 1){
                    // TODO: call in global variable without extra brackets

                    int convertNum  = Parse.int(hourValue) + 12;
                    //TODO: Wrong use of Integer's parse method again.



                    inputVals[1] = String.valueOf(convertNum);

                    // hour value has been solved

                }


                //TODO: HasNext method can only be used with Scanner, while loop not needed here.

                    StringJoiner stringjoiner = new StringJoiner(":");
                    stringjoiner.add(val);

                    // TODO: Review how to use Stringjoiner at end of program to return back a completed String



                return //whatever StringJoiner generated

            }

        }




    }





    public static void main(String[] args) {
        String s = "07:05:45PM";
        timeConversion(s);

    }







}
