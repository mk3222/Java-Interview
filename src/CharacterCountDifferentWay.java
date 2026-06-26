public class CharacterCountDifferentWay {
    public static void main(String[] args) {

/*        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.nextLine();
*/
        String str = "Hello World";
        int[] counts = new int[26];

        // Count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                counts[Character.toLowerCase(ch) - 'a']++;
            }
        }

        // Print the results
        for (int i = 0; i < 26; i++) {
            if (counts[i] > 0) {
                System.out.println((char) (i + 'a') + ": " + counts[i]);
            }
        }
    }
}
