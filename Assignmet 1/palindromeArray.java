public class palindromeArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};

        int i = 0;
        int j = arr.length - 1;

        boolean flag = true;

        while (i < j) {
            if (arr[i] != arr[j]) {
                flag = false;
                break;
            }

            i++;
            j--;
        }

        System.out.println(flag ? "Palindrome" : "Not Palindrome");
    }
}
