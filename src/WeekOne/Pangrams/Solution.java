package WeekOne.Pangrams;

import java.io.*;

class Result {

    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
        int[] freqArr = new int[26];
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (Character.isLetter(currentChar)) {
                freqArr[currentChar - 'a'] += 1;
            }
        }

        for (int ch : freqArr) {
            if (ch == 0) {
                return "not pangram";
            }
        }
        return "pangram";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.pangrams(s);

        System.out.println(result);

        //bufferedWriter.write(result);
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}

