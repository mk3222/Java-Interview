void main() {
    int n1 = 20;
    int n2 = 30;
    int temp;
    IO.println("Before Swap " + n1 + "," + n2);

    temp = n1; // temp = 20;
    n1 = n2; // n1= 30;
    n2 = temp; // n2 = 20;
    IO.println("After Swap " + n1 + "," + n2);
}
