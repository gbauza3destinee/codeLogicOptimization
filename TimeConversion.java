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

        // 1. Intention- Save whatever value is in index 1, since I know it will be our hour value.

       // OG : Fixed the structure of the code, as it makes it so that "string" is hardcoded into index 1 -> inputVals[1] = "hourValue";
        // rather than EXTRACTING value at index 1.

        String hour = inputVals[1];

        System.out.println(hour);
        int hourValue = Integer.parseInt(hour);

       //OG: int hourValue = Parse.int(hourValue);
        // TODO: L23 Wrong format of Integer.parseInt() method - review special case

        for(String val : inputVals){

           // 1. Or i can save the value of val in first iteration here into a variable
            // that will be accessible outside of the for loop scope.

            if (val.equals("PM")){

                if (hourValue>= 1){
                    // TODO: call in global variable without extra brackets

                    // OG int convertNum  = Parse.int(hourValue) + 12;

                    int convertNum  = hourValue + 12;


                    //TODO: Wrong use of Integer's parse method again.

                    // 2. Overwrite hour val (index 1) to new math #
                    inputVals[1] = String.valueOf(convertNum);

                    // hour value has been solved
                }

            }

            //TODO: HasNext method can only be used with Scanner, while loop not needed here.
            StringJoiner militaryTime = new StringJoiner(":");
            militaryTime.add(val);
            // 3. t/f the variable instantiated with stringjoiner will now become the update string value.


            // TODO: Review how to use Stringjoiner at end of program to return back a completed String



            return militaryTime.toString();
            //whatever StringJoiner generated

        }




        return s.substring(0, s.length()-2);
        // another way to take off PM/AM - s.substring(0, "[a-z]");

        // minus the PM or AM


    }







    public static void main(String[] args) {
        String s = "07:05:45PM";
        timeConversion(s);

    }







}
