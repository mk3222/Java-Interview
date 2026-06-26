void main() {

    ArrayList<Integer> al = new ArrayList<>();

    al.add(15);
    al.add(20);
    al.add(25);
    al.add(30);

    IO.println("Traverse through for loop");
    IO.println("Size of the arraylist: " + al.size());

    for (Integer integer : al) {
        IO.println(integer);
    }
}
