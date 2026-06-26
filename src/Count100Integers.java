import java.util.ArrayList;

public class Count100Integers {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(100);

        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
            System.out.println(numbers.get(i - 1));
        }
    }
}