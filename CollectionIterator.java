package collection;
import java.util.*;

public class CollectionIterator {
    public static void main(String[] args) {
        
    

    ArrayList al = new ArrayList<>();

    al.add(100);
    al.add(50);
    al.add(150);
    al.add(25);
    al.add(125);
    al.add(175);
    al.add(75);

    System.out.println(al);

    Iterator itr = al.iterator();
    while(itr.hasNext()){
        System.out.println(itr.next());
    }


    ListIterator litr = al.listIterator(al.size());
    while(litr.hasPrevious()){
    System.out.println(litr.previous());
    }



    }
}
