package collection;
import java.util.*;

public class Map {
    
    public static void main(String[] args) {
        HashMap hm = new HashMap<>();
        hm.put("virat", "kohli");
        hm.put("mahendra" , "dhoni");
        hm.put("rohit", "sharma");

        System.out.println(hm);

        Hashtable ht = new Hashtable<>();
        ht.put(18,"virat" );
        ht.put(07,"dhoni" );
        ht.put(15, "rohit");

        System.out.println(ht);
    
        LinkedHashMap lhm = new LinkedHashMap<>();
        lhm.put("virat", "kohli");
        lhm.put("mahendra" , "dhoni");
        lhm.put("rohit", "sharma");

        //System.out.println(lhm);
        //lhm.clear();
        System.out.println(lhm.keySet());
        System.out.println(lhm.remove("virat"));
        System.out.println(lhm);


        //TreeMap tm = new TreeMap();
        // tm.put("virat", "max");
        // tm.put("jaddu" , "dhoni");
        // tm.put("rohit", "bumrah");
        


    }
    
}
