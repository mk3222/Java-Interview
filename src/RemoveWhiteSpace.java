public class RemoveWhiteSpace {
    public static void main(String[] args) {

        String str1 = "Hello World";
        StringBuilder str2 = new StringBuilder();
        System.out.println("The length of the string is: " + str1.length());

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != ' ') {
                str2.append(str1.charAt(i)); // H He Hel Hell Hello HelloW HelloWo ......
            }
        }
        System.out.println("The string without white space: " + str2);
    }
}
