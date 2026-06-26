public class Factorial {
    public static void main(String[] args) {

        int number = 4, fact = 1;

        for (int i = 1; i <= number; i++) {
            fact = fact * i; // 1*1=1 -- 1*2=2 -- 2*3=6 -- 6*4=24
        }
        System.out.println("Factorial of the number: " + fact);

    }
}
