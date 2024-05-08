package WeekOne.FlippingBits;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

class Result {

    /*
     * Complete the 'flippingBits' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static long flippingBits(long n) {
        long[] binaryValue = decToBinary(n);

        for (int i = 0; i < binaryValue.length; i++) {
            if (binaryValue[i] == 0) {
                binaryValue[i] = 1;
            } else {
                binaryValue[i] = 0;
            }
        }

        return binaryToDec(binaryValue);
    }

    public static long[] decToBinary(long n) {
        List<Long> binaryValue = new ArrayList<>();
        long[] binaryValue32Bits = new long[32];
        while (n > 0) {
            binaryValue.add(n % 2);
            n /= 2;
        }

        int bit = binaryValue32Bits.length - 1;
        for (Long aLong : binaryValue) {
            binaryValue32Bits[bit] = aLong;
            bit--;
        }
        return binaryValue32Bits;
    }

    public static long binaryToDec(long[] bin) {

        long decimalValue = 0;

        for (int i = 0; i < bin.length; i++) {
            if (bin[i] == 1) {
                decimalValue += (long) Math.pow(2, bin.length - 1 - i);
            }
        }

        return decimalValue;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                long n = Long.parseLong(bufferedReader.readLine().trim());

                long result = Result.flippingBits(n);
                System.out.println(result);

                //bufferedWriter.write(String.valueOf(result));
                //bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        //bufferedWriter.close();
    }
}

