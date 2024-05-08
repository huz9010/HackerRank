package WeekOne.LonelyInteger;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List<Integer> a) {
        a.sort(Comparator.naturalOrder());

        for (int i = 0; i < a.size(); i++) {

            if (i == a.size() - 1) {
                return a.get(i);
            }
            if (a.get(i) != a.get(i + 1)) {
                return a.get(i);
            }
            i += 1;
        }
        return 0;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.lonelyinteger(a);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();
        System.out.println(result);

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
