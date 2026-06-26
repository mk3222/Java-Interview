void main() {
    //  Scanner scanner = new Scanner(System.in);
    //  System.out.println("Enter a string to reverse:");
    //  String str = scanner.nextLine();
    String str = "Hello World";
    StringBuilder reversed = new StringBuilder();

    // Reverse the string
    for (int i = str.length() - 1; i >= 0; i--) {
        reversed.append(str.charAt(i));
    }

    IO.println("The reversed string is: " + reversed);
}