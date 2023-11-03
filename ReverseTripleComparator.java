import java.util.Comparator;

public class ReverseTripleComparator<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>>
        implements Comparator<Triple<T1, T2, T3>> {

    @Override
    public int compare(Triple<T1, T2, T3> o1, Triple<T1, T2, T3> o2) {
        if (o1.getFirst().compareTo(o2.getFirst()) != 0) {
            return o2.getFirst().compareTo(o1.getFirst());
        } else if (o1.getSecond().compareTo(o2.getSecond()) != 0) {
            return o2.getSecond().compareTo(o1.getSecond());
        } else {
            return o2.getThird().compareTo(o1.getThird());
        }
    }
}

