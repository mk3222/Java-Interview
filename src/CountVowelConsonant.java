void main() {

    int vCount = 0, cCount = 0;
    String str = "Hello World";
    str = str.toLowerCase();
    IO.println("String in lower case: " + str);

    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
            vCount++;
        } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
            cCount++;
        }
    }
    IO.println("Number of vowels: " + vCount);
    IO.println("Number of constants: " + cCount);
}
