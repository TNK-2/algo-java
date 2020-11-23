package hackerrank.greedy.absdiff;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumAbsoluteDifference function below.
    static int minimumAbsoluteDifference(int[] arr) {
        List<Integer> sortedList = new ArrayList<>();
        int minDiff = 1000000000;
        for (int i = 0; i < arr.length; i++) {
            int afterDiff = 1000000000;
            int beforeDiff = 1000000000;

            if (sortedList.isEmpty()) {
                sortedList.add(arr[i]);
                continue;
            }

            int low = 0;
            int high = sortedList.size() - 1;
            int mid = sortedList.size() / 2;
            while (high > low) {
                if (sortedList.get(mid) > arr[i]) {
                    high = mid - 1;
                } else if (sortedList.get(mid) < arr[i]) {
                    low = mid + 1;
                } else {
                    high = mid;
                    low = mid;
                }
                mid = (high + low) / 2;
            }

            int addIndex = mid;
            if (sortedList.get(addIndex) >= arr[i]) {
                sortedList.add(addIndex, arr[i]);
            } else {
                addIndex++;
                sortedList.add(addIndex, arr[i]);
            }

            if (addIndex > 0) {
                beforeDiff = Math.abs(sortedList.get(addIndex) - sortedList.get(addIndex - 1));
            }

            if (addIndex < sortedList.size() - 1) {
                afterDiff = Math.abs(sortedList.get(addIndex + 1) - sortedList.get(addIndex));
            }

            int absDiff = Math.min(beforeDiff, afterDiff);
            if (minDiff > absDiff) {
                minDiff = absDiff;
            }
        }

        return minDiff;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = minimumAbsoluteDifference(arr);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}