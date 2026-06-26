public class MissingNumberInArray {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 4, 5};

        // 1,2,3,4,5; // Total sum = 15
        // Sum of array = 12; // 15 - 12 = 3

        int sum = 0;
        int n = arr.length;
        System.out.println("Length of the array is: " + n);

        int totalSum = (n + 1) * (n + 2) / 2;
        System.out.println("Sum of all number: " + totalSum);

        for (int j : arr) {
            sum = sum + j;
        }

        int missingNumber = totalSum - sum;
        System.out.println("Missing number is: " + missingNumber);
    }
}
