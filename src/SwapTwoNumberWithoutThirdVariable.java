void main() {
    int n1 = 20;
    int n2 = 30;
    IO.println("Before Swap " + n1 + "," + n2);

    n1 = n1 + n2; // n1 = 20 + 30 = 50
    n2 = n1 - n2; // n2 = 50 - 30 = 20
    n1 = n1 - n2; // n1 = 50 - 20 = 30

    IO.println("After Swap " + n1 + "," + n2);

}
