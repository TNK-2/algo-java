package sort.quick;

public class Main {

    /**
     * ピボットのソート後の要素番号を返す
     *
     * @param numbers
     * @param low
     * @param high
     * @return
     */
    private int partition(int[] numbers, int low, int high) {
        int i = low - 1;
        int pivot = numbers[high];
        for (int j = low; j < high; j++) {
            if (numbers[j] <= pivot) {
                i += 1;
                int tmp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = tmp;
            }
        }
        int tmp = numbers[i + 1];
        numbers[i + 1] = numbers[high];
        numbers[high] = tmp;
        return i + 1;
    }

    private void doSort(int[] numbers, int low, int high) {
        if (low < high) {
            int partitionIndex = this.partition(numbers, low, high);
            this.doSort(numbers, low, partitionIndex - 1);
            this.doSort(numbers, partitionIndex + 1, high);
        }
    }

    private int[] quickSortAsc(int[] numbers) {
        this.doSort(numbers, 0, numbers.length - 1);
        return numbers;
    }

    public static void main(String[] args) {
        Main main = new Main();
        int[] result = main.quickSortAsc(new int[]{5, 1, 4, 7, 2, 8, 10, 6});
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
