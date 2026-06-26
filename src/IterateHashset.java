void main() {
    HashSet<String> hs = new HashSet<>();
    hs.add("Dhaka");
    hs.add("Toronto");
    hs.add("New York");
    hs.add("Landon");


    // 1st option:
//        Iterator<String> it = hs.iterator();
//        System.out.println("Hashset contains:");
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }

    // 2nd option
    IO.println("Hashset contains:");
    for (String str : hs) {
        IO.println(str);
    }

}

