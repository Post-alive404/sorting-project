package com.epam.rd.autotasks;

import java.util.Arrays;

/**
 * The Sorting program is sorting integer array.
 * 1. the method sort() sorts an integer array in ascending order
 * 2. an integer array is passed as a parameter to the method
 * 3. when given array is null, the method must throw an IllegalArgumentException.
 *
 * @author Denys Parshutkin
 * @version 1.0
 * @since 2023-09-06
 */

public class Sorting {
    public void sort(int[] array){
        if(array == null){
            throw new IllegalArgumentException("Array is null");
        }
        Arrays.sort(array);
    }
}
