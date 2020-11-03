package sort.bubble;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        int[] array = {5, 4, 3, 2, 1};
        int[] result = main.bubbleSort(array);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    /**
     * 昇順にソート
     * @param numbers
     * @return
     */
    private int[] bubbleSort(int[] numbers) {
        int length = numbers.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }
        }
        return numbers;
    }
}
