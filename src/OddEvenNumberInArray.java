void main() {

    int[] arr = {6, 2, 7, 3, 5};

    IO.println("The odd numbers are: ");
    for (int j : arr) {
        if (j % 2 != 0) {
            IO.print(j + " ");
        }
    }
    IO.println();
    IO.println("The even numbers are: ");
    for (int j : arr) {
        if (j % 2 == 0) {
            IO.print(j + " ");
        }
    }

}
