void main() {
    // Initialize an array
    int[] arr = new int[]{3, 7, 1};

    // Printing size of the array
    IO.println("Length of the array is: " + arr.length);

    IO.println("Reversed  Array order is: ");

    for (int i = arr.length - 1; i >= 0; i--) {
        IO.print((arr[i] + " "));
    }

}
