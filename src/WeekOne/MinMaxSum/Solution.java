package WeekOne.MinMaxSum;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    public static void miniMaxSum(List<Integer> arr) {

        long minSum = arr.stream().sorted(Comparator.reverseOrder())
                .skip(1).mapToLong(Long::valueOf).sum();

        long maxSum = arr.stream().sorted(Comparator.naturalOrder())
                .skip(1).mapToLong(Long::valueOf).sum();

        System.out.printf("%d %d", minSum, maxSum);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}

