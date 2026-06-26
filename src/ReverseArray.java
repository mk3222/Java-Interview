public class ReverseArray {

    public static void main(String[] args) {
        // Initialize an array
        int[] arr = new int[]{3, 7, 1};

        // Printing size of the array
        System.out.println("Length of the array is: " + arr.length);

        System.out.println("Reversed  Array order is: ");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print((arr[i] + " "));
        }

    }
}
