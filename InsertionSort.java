public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {3, 24, 6, 1, 9, 50};
        insertionSort(array);
        for (int num : array) {
            System.out.print(num + "\t");
        }
    }

    private static void insertionSort(int[] array) {
        if (array == null || array.length < 2) {
            return;
        }
        for (int end = 1; end < array.length; end++) {
            int val = array[end], index = end - 1;
            while (index >= 0 && array[index] > val) {
                array[index + 1] = array[index];
                array[index] = val;
                index--;
            }
        }
    }
}