public class WordCount {

    public static void main(String[] args) {
        String words = "Hello World! How are you?";
        int countWords = words.split("\\s").length;
        System.out.println("Number of words: " + countWords);
    }
}
