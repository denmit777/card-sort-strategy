package homework4.task2;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortingContextTest {

    private SortingContext sort = new SortingContext();
    private BubbleSort bubbleSort = new BubbleSort();
    private SelectionSort selectionSort = new SelectionSort();

    private final static int[] arr = {2, 8, -4, 0, 6, 2, 0, -9, -8, 14, 6, -3};

    @Test
    public void testAscendingSortByBubbleSort() {
        sort.setSortable(bubbleSort);
        int[] expected = new int[]{-9, -8, -4, -3, 0, 0, 2, 2, 6, 6, 8, 14};

        int[] result = sort.ascendingSort(arr);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testDescendingSortByBubbleSort() {
        sort.setSortable(bubbleSort);
        int[] expected = new int[]{14, 8, 6, 6, 2, 2, 0, 0, -3, -4, -8, -9};

        int[] result = sort.descendingSort(arr);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testAscendingSortByBubbleSortNegative_IfArrayLengthEqualsOne() {
        sort.setSortable(bubbleSort);
        int[] expected = new int[]{5};

        int[] result = sort.descendingSort(new int[]{5});

        assertArrayEquals(expected, result);
    }

    @Test(expected = NullPointerException.class)
    public void testAscendingSortByBubbleSortNegative_IfArrayIsEqualsNull() {
        sort.setSortable(bubbleSort);

        int[] result = sort.descendingSort(null);
    }

    @Test
    public void testAscendingSortBySelectionSort() {
        sort.setSortable(selectionSort);
        int[] expected = new int[]{-9, -8, -4, -3, 0, 0, 2, 2, 6, 6, 8, 14};

        int[] result = sort.ascendingSort(arr);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testDescendingSortBySelectionSort() {
        sort.setSortable(selectionSort);
        int[] expected = new int[]{14, 8, 6, 6, 2, 2, 0, 0, -3, -4, -8, -9};

        int[] result = sort.descendingSort(arr);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testDescendingSortByBubbleSortNegative_IfArrayLengthEqualsOne() {
        sort.setSortable(selectionSort);
        int[] expected = new int[]{5};

        int[] result = sort.descendingSort(new int[]{5});

        assertArrayEquals(expected, result);
    }

    @Test(expected = NullPointerException.class)
    public void testDescendingSortByBubbleSortNegative_IfArrayIsEqualsNull() {
        sort.setSortable(selectionSort);

        int[] result = sort.descendingSort(null);
    }
}