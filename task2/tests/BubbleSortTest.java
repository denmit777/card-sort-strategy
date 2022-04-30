package homework4.task2;

import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortTest {

    private BubbleSort bubbleSort = new BubbleSort();
    private final static int[] arr = {10, 2, 10, 3, 1, 5, 0};

    @Test
    public void testAscendingSortByBubbleSort() {
        int[] expected = new int[]{0, 1, 2, 3, 5, 10, 10};

        int[] result = bubbleSort.ascendingSort(arr);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testDescendingSortByBubbleSort() {
        int[] expected = new int[]{10, 10, 5, 3, 2, 1, 0};

        int[] result = bubbleSort.descendingSort(arr);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testAscendingSortByBubbleSortNegative_IfArrayLengthEqualsOne() {
        int[] expected = new int[]{5};

        int[] result = bubbleSort.descendingSort(new int[]{5});

        assertArrayEquals(expected, result);
    }

    @Test(expected = NullPointerException.class)
    public void testAscendingSortByBubbleSortNegative_IfArrayIsEqualsNull() {
        int[] result = bubbleSort.descendingSort(null);
    }
}