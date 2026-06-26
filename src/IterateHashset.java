import java.util.HashSet;

public class IterateHashset {
    public static void main(String[] args) {
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
        System.out.println("Hashset contains:");
        for (String str : hs) {
            System.out.println(str);
        }

    }

}

