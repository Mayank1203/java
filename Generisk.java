package collection;
import java.util.*;

// class S1{
    // private String name ;
    // private int age;
// }
// 
// class S2{
    // private String ename;
    // private int id ;
// }

class Gen<T>{
    T obj ;

    public Gen(T obj){
        this.obj = obj;
    }

    public void dis(){
        System.out.println(obj.getClass().getName());
    }

    public T getobj(){
        return obj;
    }
}

public class Generisk {
    private static int obj;

    public static void main(String[] args) {
        // S1 jkl = new S1();

        // S2 lkj = new S2();

        // ArrayList<S1> al = new ArrayList<S1>();//this indicates that you can work only with S1 object
        // al.add(jkl);
        //al.add(lkj);

        Gen<Integer> g = new Gen<Integer>(obj=5);
        g.dis();
        System.out.println(g.getobj());


    }
    
}
