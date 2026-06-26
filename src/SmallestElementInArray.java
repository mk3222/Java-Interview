void main() {

    int[] arr = new int[]{85, 25, 33, 405, 51};

    int min = arr[0]; // 85, 405,

    for (int i = 1; i < arr.length; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
    }
    IO.println("Largest Element of an Array: " + min);
}
