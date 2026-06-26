public class AllSubsets {
    public static void main(String[] args) {

        String str = "CAT";
        int len = str.length();
        System.out.println("Length of the string is: " + len);
        int temp = 0;
        System.out.println("Size of the array is: " + len * (len + 1) / 2);

        String[] arr = new String[len * (len + 1) / 2];
        for (int i = 0; i < len; i++) {                     // i = 0, 1, 2
            for (int j = i; j < len; j++) {                 // j = 0, 1, 2, 1, 2, 2
                arr[temp] = str.substring(i, j + 1);        // C, CA, CAT, A, AT, T
                temp++;
            }
        }
        System.out.println("All subsets for the given string are: ");
        for (String s : arr) {
            System.out.print(s + " ");
        }
    }
}
