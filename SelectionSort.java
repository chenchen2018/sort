public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {3, 24, 6, 1, 9, 50};
        selectionSort(array);
        for (int num : array) {
            System.out.print(num + "\t");
        }
    }

    //找最小值
    private static void selectionSort(int[] array) {
        if (array == null || array.length < 2) {
            return;
        }
        for (int start = 0; start < array.length - 1; start++) {
            int indexForMin = start, min = array[start];
            for (int cursor = start + 1; cursor < array.length; cursor++) {
                if (array[cursor] < min) {
                    indexForMin = cursor;
                    min = array[cursor];
                }
            }
            array[indexForMin] = array[start];
            array[start] = min;
        }
    }
}