package homework4.task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 8, -4, 0, 6, 2, 0, -9, -8, 14, 6, -3};
        SortingContext sort = new SortingContext();
        sort.setSortable(new BubbleSort());
        System.out.println(Arrays.toString(sort.ascendingSort(arr)));
        System.out.println(Arrays.toString(sort.descendingSort(arr)));
        sort.setSortable(new SelectionSort());
        System.out.println(Arrays.toString(sort.ascendingSort(arr)));
        System.out.println(Arrays.toString(sort.descendingSort(arr)));
    }
}
