void main() {

    String str = "Hello World";
    str = str.replaceAll("\\s+", "");
    IO.println("The string without white space: " + str);
}
