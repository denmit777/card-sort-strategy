package homework4.task2;

public class SelectionSort implements Sortable {

    @Override
    public int[] ascendingSort(int[] arr) {
        for (int left = 0; left < arr.length; left++) {
            int minInd = left;
            for (int i = minInd; i < arr.length; i++) {
                if (arr[i] < arr[minInd]) {
                    minInd = i;
                }
            }
            Sortable.swap(arr, left, minInd);
        }
        return arr;
    }

    @Override
    public int[] descendingSort(int[] arr) {
        for (int left = 0; left < arr.length; left++) {
            int minInd = left;
            for (int i = minInd; i < arr.length; i++) {
                if (arr[i] > arr[minInd]) {
                    minInd = i;
                }
            }
            Sortable.swap(arr, left, minInd);
        }
        return arr;
    }
}
