public class OddEvenNumberInArray {
    public static void main(String[] args) {

        int[] arr = {6, 2, 7, 3, 5};

        System.out.println("The odd numbers are: ");
        for (int j : arr) {
            if (j % 2 != 0) {
                System.out.print(j + " ");
            }
        }
        System.out.println();
        System.out.println("The even numbers are: ");
        for (int j : arr) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
        }

    }
}
