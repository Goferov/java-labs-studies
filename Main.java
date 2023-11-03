import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Triple<Integer, Double, String> triple1 = new Triple<>(1, 2.5, "A");
        Triple<Integer, Double, String> triple2 = new Triple<>(3, 2.5, "B");
        Triple<Integer, Double, String> triple3 = new Triple<>(2, 3.25, "C");
        Triple<Integer, Double, String> triple4 = new Triple<>(1, 3.3, "D");
        Triple<Integer, Double, String> triple5 = new Triple<>(1, 2.5, "A");

        System.out.println(triple1);

        System.out.println("Czy triple1 jest równy triple2? " + triple1.equals(triple2));
        System.out.println("Czy triple1 jest równy triple5? " + triple1.equals(triple5));

        List<Triple<Integer, Double, String>> list = new ArrayList<>();
        list.add(triple1);
        list.add(triple2);
        list.add(triple3);
        list.add(triple4);
        list.add(triple5);

        // Comparable
        Collections.sort(list);
        System.out.println("Posortowana lista:");
        for (Triple<Integer, Double, String> triple : list) {
            System.out.println(triple);
        }

        // Comparator
        Collections.sort(list, Triple.reverseOrderComparator());
        System.out.println("Lista posortowana odwrotnie:");
        for (Triple<Integer, Double, String> triple : list) {
            System.out.println(triple);
        }
    }
}
