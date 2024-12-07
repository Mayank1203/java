package collection ;

import java.util.*;

public class Collection {
    public static void main(String[] args) {
        
    
        // // ARRAYLIST USE 
        // ArrayList jkl = new ArrayList();
        // jkl.add(1);
        // jkl.add(2);
        // jkl.add(3);

        // System.out.println(jkl);
        // System.out.println("###############");

        // ArrayList jkl1 = new ArrayList();
        // jkl1.add("op");
        // jkl1.add(12);
        // jkl1.add(9.789);

        // System.out.println(jkl1);
        // System.out.println("************");

        // jkl.add(jkl1);
        // System.out.println(jkl);

        // ArrayDeque Use
        // it is unable to provide index vice adding because of queue concept
        // ArrayDeque obj = new ArrayDeque();
        // obj.add(1);
        // obj.add("op");
        // obj.add(1.123);

        // System.out.println(obj);

        // obj.addFirst("FIRST");
        // obj.addLast("LAST");
        // 
        // System.out.println(obj);

        // obj.offer('#');
        // obj.offerFirst('#');
        // obj.offerLast('#');

        // System.out.println(obj);

        // PRIORITY QUEUE USE
        // IT FOLLOWS MIN HEAP DATA STRUCTURE AND GIVE ANSWER ACC TO THIS
        // IT ALLOW DUPLICATES
        // PriorityQueue pq = new PriorityQueue<>();

        // pq.add(10);
        // pq.add(2);
        // pq.add(1);
        // pq.add(45);
        // pq.add(50);
        // pq.add(50);

        // System.out.println(pq);

        // TreeSet implementation
        // IT FOLLOW BINARY TREE (IN-ORDER TRAVERSAL) CONCEPT

        // TreeSet tq = new TreeSet<>();
        // tq.add(100);
        // tq.add(25);
        // tq.add(50);
        // tq.add(150);
        // tq.add(75);
        // tq.add(125);
        // tq.add(175);
        // tq.add(175);// only take one value

        // System.out.println(tq);

        // System.out.println(tq.higher(150));
        // System.out.println(tq.lower(100));

        // System.out.println(tq.ceiling(79));
        // System.out.println(tq.floor(125));

        // HashSet IMPLEMENTATION
        // IT DOES NOT ALLOW DUPLICATES
        // FOLLOWS HASHING ALGO

        HashSet hs = new HashSet();

        hs.add(100);
        hs.add(50);
        hs.add(150);
        hs.add(25);
        hs.add(125);
        
        hs.add(175);

        System.out.println(hs);

        // LinkedHashSet implementation


        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add(100);
        lhs.add(50);
        lhs.add(150);
        lhs.add(25);
        lhs.add(125);
        
        lhs.add(175);

        System.out.println(lhs);



    }

    public static void frequency(ArrayList<Integer> al, int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'frequency'");
    }


    }
