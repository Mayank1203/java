
public class Main {
    public static void main(String[] args) {
             int a=3;
             int b=4;
             int c=5;
             // logical AND
             System.out.println(a==b && a<b && a<c);
        System.out.println(b<c && a<b && a<c);

        // logical OR

        System.out.println(a==b || a<b || a<c);

        // logical NOT

        System.out.println(!(a==b && a<b && a<c));

    }
}