import java.util.Arrays;

public class BinarySearch {

    private int[] arr;
    private int comparisons;

    public BinarySearch(int[] arr) {
        this.arr = arr;
        comparisons = 0;
    }

    public int binarySearch(int x) {
        int start = 0;
        int end = arr.length - 1;
        int mid;

        while (start <= end) {
            mid = (start + end) / 2;
            comparisons++;

            if (arr[mid] == x) {
                System.out.println("Number of comparisons: " + comparisons);
                return mid;
            } else if (arr[mid] < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println("Number of comparisons: " + comparisons);
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[1000];
        for (int i = 0; i < 1000; i++) {
            arr[i] = i;
        }

        BinarySearch binarySearch = new BinarySearch(arr);
        int result = binarySearch.binarySearch(500);

        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found");
        }

        int linearSearchResult = linearSearch(arr, 500);
        System.out.println("Number of comparisons in binary search: " + binarySearch.comparisons);
        System.out.println("Number of comparisons in linear search: " + linearSearchResult);
    }

    public static int linearSearch(int[] arr, int x) {
        int comparisons = 0;
        for (int i = 0; i < arr.length; i++) {
            comparisons++;
            if (arr[i] == x) {
                System.out.println("Element found at index " + i);
                break;
            }
        }
        System.out.println("Number of comparisons: " + comparisons);
        return comparisons;
    }
}