 public class Main {
     public static void main(String[] args) {
        int a=20;
         int b=45;
         int c=15;

         int result=(a>b)?a:b;
         System.out.println(result);

          String result1=(a<b)?"a is greater" : "b is greater";
         System.out.println(result1);

         int num=(a<b)? (a<c? a:b): (b<c? a:b);
         System.out.println(num);
     }
 }
