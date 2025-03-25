import java.util.Arrays;

public class SearchComparison {

    // Linear Search - O(N)
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    // Binary Search - O(log N)
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19}; // Defined array
        int target = 7; // Target to search

        // Linear Search
        int linearIndex = linearSearch(arr, target);
        System.out.println("Linear Search: Target found at index " + linearIndex);

        // Sorting for Binary Search
        Arrays.sort(arr);
        int binaryIndex = binarySearch(arr, target);
        System.out.println("Binary Search: Target found at index " + binaryIndex);
    }
}
