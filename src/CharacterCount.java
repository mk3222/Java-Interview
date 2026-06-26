public class CharacterCount {
    public static void main(String[] args) {

        String str = "Hello World";
        int count = 0;
        System.out.println("Length of the string is: " + str.length());

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count++; // 1 2 3 4 5 6 7 8 9
            }
        }
        System.out.println("Count of characters: " + count);
    }
}
