import java.util.ArrayList;

public class TraverseArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(15);
        al.add(20);
        al.add(25);
        al.add(30);

        System.out.println("Traverse through for loop");
        System.out.println("Size of the arraylist: " + al.size());

        for (Integer integer : al) {
            System.out.println(integer);
        }
    }
}
