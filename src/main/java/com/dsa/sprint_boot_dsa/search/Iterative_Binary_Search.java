package com.dsa.sprint_boot_dsa.search;

public class Iterative_Binary_Search {

    //time complexity = O(log n)
    //space  complexity = O(1)
    public static int iterativeBinarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13};
        int targetElement = 1;

        // Scenario 1: Target is the middle element
        int foundIndex = Iterative_Binary_Search.iterativeBinarySearch(sortedArray, targetElement);
        if (foundIndex == -1) {
            System.out.println(targetElement + " element not found");
        } else {
            System.out.println(targetElement + " found at index: " + foundIndex);
        }

    }
}
