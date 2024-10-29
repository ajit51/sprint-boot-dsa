package com.dsa.sprint_boot_dsa.search;

import java.util.Arrays;

public class ArrayBinarySearch {

    //time complexity = O(log n)
    //space  complexity = O(1)
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int key = 30;
        int result = Arrays.binarySearch(arr, key);
        if (result < 0)
            System.out.println("Element is not found!");
        else
            System.out.println("Element is found at index: " + result);
    }
}
