public class SwapTwoNumbers {
    public static void main(String[] args) {
        int n1 = 20;
        int n2 = 30;
        int temp;
        System.out.println("Before Swap " + n1 + "," + n2);

        temp = n1; // temp = 20;
        n1 = n2; // n1= 30;
        n2 = temp; // n2 = 20;
        System.out.println("After Swap " + n1 + "," + n2);
    }
}
