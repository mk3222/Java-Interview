void main() {

    String str = "Hello World Hello";

    String[] words = str.split("\\s+");
    for (int i = 0; i < words.length; i++) {
        for (int j = i + 1; j < words.length; j++) {
            if (words[i].equalsIgnoreCase(words[j])) {
                IO.println("Duplicate word: " + words[i]);
            }
        }
    }
}
