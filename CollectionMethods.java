package collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionMethods {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(1);
        al.add(6);
        al.add(4);
        al.add(9);
        al.add(12);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);

        System.out.println(Collections.binarySearch(al, 4));

        Collections.rotate(al, 1);
        System.out.println(al);

        Collections.shuffle(al);
        System.out.println(al);

        System.out.println(Collections.frequency(al , 9));


    }
    
}
