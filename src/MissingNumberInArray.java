void main() {

    int[] arr = new int[]{1, 2, 4, 5};

    // 1,2,3,4,5; // Total sum = 15
    // Sum of array = 12; // 15 - 12 = 3

    int sum = 0;
    int n = arr.length;
    IO.println("Length of the array is: " + n);

    int totalSum = (n + 1) * (n + 2) / 2;
    IO.println("Sum of all number: " + totalSum);

    for (int j : arr) {
        sum = sum + j;
    }

    int missingNumber = totalSum - sum;
    IO.println("Missing number is: " + missingNumber);
}
