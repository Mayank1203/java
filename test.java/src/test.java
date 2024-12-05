public class test {
      // IN THIS VARIABLES ARE KNOWN AS INSTANCE VARIABLES
    int a = 3 ;
    String name = "Mayank";
    public static void main(String[] args){   // IN THIS BLOCKS VARIABLES ARE LOCAL VARIABLES
          // declare the variable;
        int num = 9;// PRIMITIVE
        // made the object
        test obj = new test();// REFERENCE
        test obj1 = new test();

        obj.name = "navin";
         obj.a = 4 ;

        System.out.println(obj.a);
        System.out.println(obj.name);

        System.out.println(obj1.a);
        System.out.println(obj1.name);
    }

}
