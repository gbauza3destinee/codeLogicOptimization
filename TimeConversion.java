public class TimeConversion {




    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here


        String[] inputVals = s.split(":", 3);

        inputVals[1] = hourValue
        int hourValue = Parse.int(hourValue);


        for(String val : inputVals){

            if (val.equals("PM")){

                if ((hourValue)) >= 1){
                    int convertNum  = Parse.int(hourValue) + 12;
                    inputVals[1] = String.valueOf(convertNum);

                    // hour value has been solved

                }


                while(inputVals.hasNext()){
                    StringJoiner stringjoiner = new StringJoiner(":");
                    stringjoiner.add(val);

                }

                return //whatever StringJoiner generated

            }

        }




    }





    public static void main(String[] args) {
        String s = "07:05:45PM";
        timeConversion(s);

    }







}
