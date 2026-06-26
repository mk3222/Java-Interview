void main() {
    printFizzBuzz(100);
}

public static void printFizzBuzz(int n) {
    for (int i = 1; i <= n; i++) {
        if (i % 3 == 0 && i % 5 == 0) {
            IO.println("FizzBuzz");
        } else if (i % 3 == 0) {
            IO.println("Fizz");
        } else if (i % 5 == 0) {
            IO.println("Buzz");
        } else {
            IO.println(i);
        }
    }
}


