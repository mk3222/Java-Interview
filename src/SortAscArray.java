void main() {

    int[] arr = new int[]{6, 8, 4, 2, 5};
    int temp;

    IO.println("Elements of original array: ");
    for (int k : arr) {
        IO.print(k + " ");
    }
    for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] > arr[j]) { // 6>8, 6>4, 4>2, 2>5, 8>6
                // > = Asc, < = Desc
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp; // 4,8,6,2,5 - 2,8,6,4,5 - 2,6,8,4,5
            }
        }
    }
    IO.println();
    IO.println("Elements of asc sorted array: ");
    for (int j : arr) {
        IO.print(j + " ");
    }
}
