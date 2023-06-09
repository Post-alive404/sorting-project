package com.epam.rd.autotasks;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SortingTest {

    Sorting sorting = new Sorting();

    @Test(expected = IllegalArgumentException.class)
    public void testNullCase(){
        sorting.sort(null);
    }

    @Test
    public void testEmptyCase(){
        int[] array = new int[0];
        sorting.sort(array);
        assertEquals("[]", Arrays.toString(array));
    }

    @Test
    public void testSingleElementArrayCase() {
        int[] array = {2};
        sorting.sort(array);
        assertEquals("[2]", Arrays.toString(array));

    }

    @Test
    public void testSortedArraysCase() {
        int[] array = {0, 2, 3, 4, 5};
        sorting.sort(array);
        assertEquals("[0, 2, 3, 4, 5]", Arrays.toString(array));

    }

    @Test
    public void testOtherCases() {
        int[] array1 = {5, 4, 3, 2, 1, 0};
        int[] array2 = {23, 1, 32, 4, 5, 33, 3, 14, 3, 2};
        int[] array3 = {5, -4, 22, 1, -12, 8, 0, 100};

        sorting.sort(array1);
        sorting.sort(array2);
        sorting.sort(array3);

        assertEquals("[0, 1, 2, 3, 4, 5]", Arrays.toString(array1));
        assertEquals("[1, 2, 3, 3, 4, 5, 14, 23, 32, 33]", Arrays.toString(array2));
        assertEquals("[-12, -4, 0, 1, 5, 8, 22, 100]", Arrays.toString(array3));


    }

}