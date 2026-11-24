
public class Q2linearSearch {

    static int lastOccurrence(int[] arr, int key) {

        int index = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key) {
                index = i;
            }
        }

        return index;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 20, 40, 20, 50};

        int key = 20;

        int result = lastOccurrence(arr, key);

        if (result == -1)
            System.out.println("Key not found");
        else
            System.out.println("Last occurrence at index: " + result);
    }
}
