package homework4.task2;

public interface Sortable {
    static void swap(int[] arr, int ind1, int ind2) {
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }

    int[] ascendingSort(int[] arr);

    int[] descendingSort(int[] arr);
}
