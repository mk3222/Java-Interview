void main() {
    String words = "Hello World! How are you?";
    int countWords = words.split("\\s").length;
    IO.println("Number of words: " + countWords);
}
