package sort.merge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {

    private List<Integer> mergeSortAsc(List<Integer> numbers) {
        if (numbers.size() <= 1) {
            return numbers;
        }

        int centerIndex = numbers.size() / 2;
        List<Integer> leftNumbers = this.mergeSortAsc(numbers.subList(0, centerIndex));
        List<Integer> rightNumbers = this.mergeSortAsc(numbers.subList(centerIndex, numbers.size()));

        int i = 0;
        int j = 0;
        int k = 0;
        List<Integer> result = new ArrayList<>();
        while (i < leftNumbers.size() && j < rightNumbers.size()) {
            if (leftNumbers.get(i) <= rightNumbers.get(j)) {
                result.add(k, leftNumbers.get(i));
                i++;
            } else {
                result.add(k, rightNumbers.get(j));
                j++;
            }
            k++;
        }

        while (i < leftNumbers.size()) {
            result.add(k, leftNumbers.get(i));
            i++;
            k++;
        }

        while (j < rightNumbers.size()) {
            result.add(k, rightNumbers.get(j));
            j++;
            k++;
        }
        return result;
    }

    public static void main(String[] args) {
        Main main = new Main();
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 1, 4, 7, 2, 8, 10, 6));
        List<Integer> result = main.mergeSortAsc(numbers);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}