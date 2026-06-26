void main() {

    String str = "Hello World";
    int count = 0;
    IO.println("Length of the string is: " + str.length());

    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) != ' ') {
            count++; // 1 2 3 4 5 6 7 8 9
        }
    }
    IO.println("Count of characters: " + count);
}
