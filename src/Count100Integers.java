void main() {

    ArrayList<Integer> numbers = new ArrayList<>(100);

    for (int i = 1; i <= 100; i++) {
        numbers.add(i);
        IO.println(numbers.get(i - 1));
    }
}