
public class Q3LinearSearch {

    static int nthOccurrence(int[] arr, int key, int n) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key) {

                count++;

                if (count == n) {
                    return i;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 20, 40, 20, 50, 20};

        int key = 20;
        int n = 3;

        int result = nthOccurrence(arr, key, n);

        if (result == -1)
            System.out.println("Nth occurrence not found");
        else
            System.out.println("Index of nth occurrence: " + result);
    }
}
