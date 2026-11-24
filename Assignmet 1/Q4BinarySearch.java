
public class Q4BinarySearch {

    static int binarySearch(int[] arr, int key) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            else if (key > arr[mid]) {
                high = mid - 1;
            }

            else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {90, 80, 70, 60, 50, 40, 30, 20, 10};

        int key = 50;

        int result = binarySearch(arr, key);

        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index: " + result);
    }
}
