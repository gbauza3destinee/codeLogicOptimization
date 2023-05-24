import java.sql.SQLOutput;

public class TimeConversion {


    // 07:05:45PM



    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Example input: 07:05:45PM -> 19:05:45


        // 1. Identify the 2 dependents  * USE SUBSTRING()

        String hourNum = s.substring(0, 2);
        String timeOfDay = s.substring(s.length() - 1, s.length() - 2);


        // 2.  Only if the hour fed in, is after 12pm we will convert into military time


        if (timeOfDay.equals("PM") && (Integer.parseInt(hourNum) < 12)) {
            System.out.println("Time of Day is afternoon and military time is applied.");

            int militaryTime = Integer.parseInt(hourNum) + (12);


            String[] splitTime = s.split(":", 3);

            // TODO: How can I look inside 'splittime's index to see what values lay there in hackerrank?

            // Swap Values new Hour Time to Military
            splitTime[1] = String.valueOf(militaryTime);

        }

        for (String element : splitTime) {


        }


        // 12am = 00:00
        // Naturally the first 12 hours in morning time (am are correct for military time)
        // However, where it changes is at noon 12 pm - after 12pm these should be +1


        // 2. Identify the time of day (Am/Pm)


        return splitTime;
    }


    public static void main(String[] args) {
        String s = "07:05:45PM";
        timeConversion(s);

    }


}
