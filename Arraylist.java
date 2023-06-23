package JavaCollections;
import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        list.add(242);
        list.add(5435);
        list.add(324);
        list.add(535);
        list.add(9887);
        li.add(23);
        li.add(285);
        li.add(2300);
        li.add(2389);
        li.addAll(0, list);
//        li.clear();
        li.clone();
        System.out.println(li.contains(989));
        li.set(2, 6969);
        for (int i = 0; i < li.size(); i++) {
            System.out.print(li.get(i));
            System.out.print(" | ");
        }
    }
}