
public class Main {
    public static void main(String[] args) {
      int age=90;

//      if(age>18){
//          System.out.println("adutlt");
//      }
//      else{
//          System.out.println("kid");
//      }

        if(age>=18 && age<60){
            System.out.println("adult");
        }
        else if(age>60){
            System.out.println("old");
        }
        else{
            System.out.println("kid");
        }
    }
}