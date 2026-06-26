public class Fibonacci {

    public static void main(String[] args) {
        int n1 = 0, n2 = 1, sum, count = 10;
        // Printing 0 and 1
        System.out.print(n1 + "," + n2);

        // Loop starts from 2, because 0 and 1 are already printed
        for (int i = 2; i <= count; i++) {
            sum = n1 + n2; // 0+1=1, 2, 3
            System.out.print("," + sum);
            n1 = n2; // 1, 1
            n2 = sum; // 1, 2
        }
    }
}
