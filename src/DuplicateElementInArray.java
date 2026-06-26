void main() {

    // Initialize an array
    int[] arr = new int[]{1, 2, 3, 4, 5, 1, 2, 3};

    IO.println("Duplicate Elements in given array");

    for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] == arr[j]) {
                IO.println(arr[j]);
            }
        }
    }
}
