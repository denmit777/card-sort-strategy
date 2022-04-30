package homework4.task2;

public class SortingContext {

    private Sortable sortable;

    public void setSortable(Sortable sortable) {
        this.sortable = sortable;
    }

    public int[] ascendingSort(int[] arr) {
        return sortable.ascendingSort(arr);
    }

    public int[] descendingSort(int[] arr) {
        return sortable.descendingSort(arr);
    }
}
