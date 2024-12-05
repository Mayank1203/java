class student {
    int age ; // IF WE USE 'PRIVATE' WORD IN FRONT THEN AGE VARIABLE IS NOT USED BY OBJECT
    String name;// IF WE USE 'PRIVATE' WORD IN FRONT THEN AGE VARIABLE IS NOT USED BY OBJECT
//    public void set(int a){
//        age = a ;
//    }
    public int getAge(){
        return age ;
    }
    public String getName(){
        return name ;
    }
    public void setAge(int age){// this is shadowing problem

        this.age = age ;// to define age is instance variable "this" keyword is used
    }
    public void setName(String name){// SETTER METHOD
        this.name = name ;
    }
//    public void show(){
//        System.out.println(name + " " + age);
//    }
}

public class enca {
    public static void main(String[] args){
    student obj = new student();
        student obj1 = new student();
        obj.setAge(12);
        obj1.setAge(1);
        obj.setName("sgfdgfjdk");
        obj1.setName("hfgsdjkdk");
//        obj.show();
//        obj1.show();
         int stud = obj.getAge();// GETTER METHOD
         System.out.println(stud);
        int stud1 = obj1.getAge();
        System.out.println(stud1);
//        int studN = obj.getName();
//        System.out.println(studN);
//        int stud1N = obj.getName();
//        System.out.println(stud1N);



    }
}
