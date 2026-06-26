import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "Brag";
        String str2 = "Grab";

        str1 = str1.toLowerCase(); // brag
        str2 = str2.toLowerCase(); // grab

        System.out.println("str1 in lower case: " + str1);
        System.out.println("str2 in lower case: " + str2);

        if (str1.length() != str2.length()) {
            System.out.println("Not anagram ------");
        } else {
            char[] string1 = str1.toCharArray();
            char[] string2 = str2.toCharArray();

            Arrays.sort(string1); // a b r g
            Arrays.sort(string2); // a b r g

            if (Arrays.equals(string1, string2)) {
                System.out.println("Both are anagram");
            } else {
                System.out.println("Not anagram *******");
            }
        }
    }
}
