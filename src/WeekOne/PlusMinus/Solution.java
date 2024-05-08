package WeekOne.PlusMinus;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    public static void plusMinus(List<Integer> arr) {
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (Integer i : arr) {
            if (i == 0) {
                zeroCount++;
            } else if (i > 0) {
                positiveCount++;
            } else {
                negativeCount++;
            }
        }

        double positiveRatio = (double) positiveCount / arr.size();
        double negativeRatio = (double) negativeCount / arr.size();
        double zeroRatio = (double) zeroCount / arr.size();

        System.out.printf("%.6f%n", positiveRatio);
        System.out.printf("%.6f%n", negativeRatio);
        System.out.printf("%.6f%n", zeroRatio);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
