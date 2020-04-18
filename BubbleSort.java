public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {3, 24, 6, 1, 9, 50};
        bubbleSort(array);
        for (int num : array) {
            System.out.print(num + "\t");
        }
    }

    private static void bubbleSort(int[] array) {
        if (array == null || array.length < 2) {
            return;
        }
        for (int range = array.length - 1; range > 0; range--) {
            for (int j = 0; j < range; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}