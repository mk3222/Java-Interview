void main() {
    int num = 153, result = 0, rem;
    int temp = num;

    while (num > 0) {
        rem = num % 10; // 153%10 = 3, 15%10 = 5, 1%1 = 1
        num = num / 10; // 153/10 = 15, 15/10 = 1, 1/10 = 0
        result = result + (rem * rem * rem); // 0 + (3*3*3) = 27, 27 + (5*5*5)=152, 152 + (1*1*1) = 153
    }
    if (result == temp) {
        IO.println("It is a Armstrong Number!");
    } else {
        IO.println("It is not a Armstrong Number!");
    }

}
