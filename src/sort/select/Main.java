package sort.select;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        int[] result = main.selectSortAsc(new int[]{0, 1, 0, 100, 99, 99, 5, 5, 1, 4, 7, 2});
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    private int[] selectSortAsc(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[minIndex] > numbers[j]) {
                    int tmp = numbers[minIndex];
                    numbers[minIndex] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }
        return numbers;
    }
}
