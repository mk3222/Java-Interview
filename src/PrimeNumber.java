void main() {
    int number = 7;
    int temp = 0;
    for (int i = 2; i <= number / 2; i++) {
        if (number % i == 0) {
            temp = temp + 1;
            break;
        }
    }
    if (temp == 0) {
        IO.println("Number is prime");
    } else {
        IO.println("Number is not prime");
    }
}
