package homework4.task2;

public class BubbleSort implements Sortable {

    @Override
    public int[] ascendingSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    Sortable.swap(arr, j, j + 1);
                }
            }
        }
        return arr;
    }

    @Override
    public int[] descendingSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    Sortable.swap(arr, j, j + 1);
                }
            }
        }
        return arr;
    }
}
