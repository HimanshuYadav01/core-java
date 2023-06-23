package JavaCollections;

import java.util.HashSet;

public class Hashing {
    public static void main(String[] args) {
        /*Hashing --> Technique in which we can search or insert elements faster in an array than the regular methods.
         Load factor --> Tells us that how much the hash table can be filled before its capacity is automatically incresed.
          Chaining --> If more than one element is coming on same index then we can associate that index to a linked list so that we have to do less iteration
          hash collision --> When more than one element is coming on same index, to handle hash collision we perform open addressing
          Open Addressing --> When more than one element is coming on the same index then we put one element at that index and other elements in the empty spaces after that index*/
        HashSet<Integer> myHashSet= new HashSet<>();
        myHashSet.add(21);
        myHashSet.add(23);
        myHashSet.add(25);
        System.out.println(myHashSet);
    }
}
