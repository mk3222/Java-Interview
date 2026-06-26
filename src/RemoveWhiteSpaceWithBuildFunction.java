public class RemoveWhiteSpaceWithBuildFunction {
    public static void main(String[] args) {

        String str = "Hello World";
        str = str.replaceAll("\\s+", "");
        System.out.println("The string without white space: " + str);
    }
}
