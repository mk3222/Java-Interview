public class ArrayCopy {
    public static void main(String[] args) {
        // Initialize 1st array
        int[] arr1 = new int[]{1, 2, 3, 4, 5};

        // Create another array 'arr2' with same as 'arr1'
        int[] arr2 = new int[arr1.length];

        // Copying elements of arr1 to arr2
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);

        // Printing elements of array2
        System.out.println("Display Elements of 2nd array");
        for (int j : arr2) {
            System.out.print(j + " ");
        }
    }
}