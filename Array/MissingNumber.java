public class MissingNumber {

    public static int findMissingNumber(int[] arr, int n) {
        int total = n * (n + 1) / 2;  // Sum of first n numbers
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        return total - sum;  // The missing number
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};  // Missing number is 5
        int n = 8;

        int missing = findMissingNumber(arr, n);
        System.out.println("The missing number is: " + missing);
    }
}
