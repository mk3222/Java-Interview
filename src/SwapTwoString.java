public class SwapTwoString {

    public static void main(String[] args) {
        String str = "Today is Thursday";
        String s1 = "Today";
        String s2 = "Thursday";
        String temp;
        System.out.println("Before Swap: " + str);

        temp = s1; // temp = Today
        s1 = s2; // s1 = Thursday
        s2 = temp; // s2 = Today
        System.out.println("After Swap: " + s1 + " is " + s2);
    }

}
