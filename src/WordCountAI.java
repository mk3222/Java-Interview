public class WordCountAI {

    public static void main(String[] args) {
        String input = "This is a test sentence.";
        String[] words = input.split(" ");
        int wordCount = words.length;
        System.out.println("Number of words: " + wordCount);
    }
}
