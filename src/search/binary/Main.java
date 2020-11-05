package search.binary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    private int binarySearch(List<Integer> numbers, int value) {
        int left = 0;
        int right = numbers.size() - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (numbers.get(mid) == value) {
                return mid;
            } else if (numbers.get(mid) < value) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main main = new Main();
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 8, 9, 10, 11, 13, 18, 20, 25));
        int result = main.binarySearch(numbers, sc.nextInt());
        System.out.println(result);
    }
}
