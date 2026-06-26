void main() {

    String str1 = "Hello World";
    StringBuilder str2 = new StringBuilder();
    IO.println("The length of the string is: " + str1.length());

    for (int i = 0; i < str1.length(); i++) {
        if (str1.charAt(i) != ' ') {
            str2.append(str1.charAt(i)); // H He Hel Hell Hello HelloW HelloWo ......
        }
    }
    IO.println("The string without white space: " + str2);
}
