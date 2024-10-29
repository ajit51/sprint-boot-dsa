package com.dsa.sprint_boot_dsa.search;

public class RecursiveBinarySearch {

    //time complexity = O(log n)
    //space  complexity = O(1)
    private static int binarySearch(int arr[], int target, int left, int righ) {
        if (left > righ) {
            return -1;
        }
        int mid = left + (righ - left) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return binarySearch(arr, target, mid + 1, righ);
        } else {
            return binarySearch(arr, target, left, mid - 1);
        }
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13};
        int targetElement = 3;

        // Scenario 1: Target is the middle element
        int foundIndex = Iterative_Binary_Search.iterativeBinarySearch(sortedArray, targetElement);
        if (foundIndex == -1) {
            System.out.println(targetElement + " element not found");
        } else {
            System.out.println(targetElement + " found at index: " + foundIndex);
        }
    }
}
