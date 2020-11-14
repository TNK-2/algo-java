package sort.insertion;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        int[] result = main.insertionSortAsc(new int[]{5, 1, 4, 7, 2, 0});
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    private int[] insertionSortAsc(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int temp = numbers[i];
            int j = i - 1;

            while (j >= 0 && numbers[j] > temp) {
                numbers[j + 1] = numbers[j];
                j -= 1;
            }
            numbers[j + 1] = temp;
        }
        return numbers;
    }

}
