void main() {
    ArrayList<String> al = new ArrayList<>();
    al.add("Dhaka");
    al.add("Toronto");
    al.add("New York");
    al.add("Landon");

    // 1st option
//        String[] arr = new String[al.size()];
//        for (int i = 0; i < al.size(); i++) {
//            arr[i] = al.get(i);
//        }

    // 2nd option
    String[] arr = al.toArray(new String[0]);

    for (String j : arr) {
        IO.println(j);
    }
}
