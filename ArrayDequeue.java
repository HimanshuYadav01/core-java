package JavaCollections;
import java.util.*;
public class ArrayDequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(3);
        ad1.add(32);
        ad1.add(353);
        ad1.add(309);
        ad1.addFirst(89);
        System.out.println(ad1.getFirst());
    }
}