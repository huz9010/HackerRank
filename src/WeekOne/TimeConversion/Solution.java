package WeekOne.TimeConversion;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

class Result {

    public static String timeConversion(String s) {

        Map<String, String> timeMap = new HashMap<>();

        timeMap.put("01", "13");
        timeMap.put("02", "14");
        timeMap.put("03", "15");
        timeMap.put("04", "16");
        timeMap.put("05", "17");
        timeMap.put("06", "18");
        timeMap.put("07", "19");
        timeMap.put("08", "20");
        timeMap.put("09", "21");
        timeMap.put("10", "22");
        timeMap.put("11", "23");
        timeMap.put("12", "00");

        if (s.contains("PM") && !s.startsWith("12") || s.contains("AM") && s.startsWith("12")) {
            StringBuilder timeStr = new StringBuilder(s);
            timeStr.replace(0, 2, timeMap.get(s.substring(0, 2)));
            s = timeStr.delete(timeStr.length() - 2, timeStr.length()).toString();
        } else {
            s = s.substring(0, s.length() - 2);
        }
        return s;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        //bufferedWriter.write(result);
        //bufferedWriter.newLine();
        System.out.println(result);

        bufferedReader.close();
        //bufferedWriter.close();
    }
}

