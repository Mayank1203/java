public class string {

    public static void main(String[] args){
//        String brand = "pw";
//        System.out.println(brand);
//        brand.concat("kota");
//
//        StringBuilder brand1 = new StringBuilder("pw") ;
//        System.out.println(brand1);
//        brand1.append("kota");
//        System.out.println(brand1);

//        String s1 = "new" ;
//        String s2 = new String("new");
//
//        System.out.println(s1==s2);
//        System.out.println(s1.equals(s2));

//        String s1 = "new" ;
//        String s2 = "new";
//        String s3 = "NEW";
//
//        System.out.println(s1==s2);
//        System.out.println(s1==s3);
//
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equals(s3));

        // STRING CONCATENATION

//        String q1 = new String("as");
//        q1=q1.concat("far");
//
//        System.out.println(q1);

//        String s1 = "aa";
//        String s2 = "aa" + "cc";
//        String s3 = "aa" + "dd" + "cc" ;
//        String s4 = s1 + s3 ;
//
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);
//        System.out.println(s4);

//        String s2 = "aa" + 98 ;// in this 98 considered as string
//        System.out.println(s2);

        // inbuilt methods in string

//        String s1 = "New";
//        System.out.println(s1);
//        System.out.println(s1.toUpperCase());
//        System.out.println(s1.toLowerCase());
//        System.out.println(s1.length());
//        System.out.println(s1.charAt(2));
//        System.out.println(s1.substring(1,2));
//        System.out.println(s1.indexOf("e"));

        // MUTABLE STRING

        // StringBuilder s3 = "hdgdf";(INVALID STATEMENT)

//        StringBuilder s3 = new StringBuilder("virat");
//        s3.append(" kohli");
//        System.out.println(s3);

        // use of word ((final))
        // final = reference to that value yet there value will be change
//         final StringBuilder s3 = new StringBuilder("virat");
//        s3.append(" kohli");
//        System.out.println(s3);
       // StringBuilder s3 = new StringBuilder("virat");

//        StringBuilder s3 = new StringBuilder();
//        System.out.println(s3.capacity());
//        s3.append("k");
//        System.out.println(s3.capacity());
//        s3.append("asdfghh");
//        System.out.println(s3.capacity());
//        s3.append("adfsgdfhgjfgdhdfj");
//        System.out.println(s3.capacity());//how many character you will add
//        System.out.println(s3.length());//how many character present

//        StringBuffer sd = new StringBuffer(150);
//        System.out.println(sd.capacity());
//        sd.append("zxcvb");
//        System.out.println(sd);
//        sd.trimToSize();// deduct the size (only take required space)
//        System.out.println(sd.capacity());

        StringBuffer sd = new StringBuffer("bnmlkj");
        System.out.println(sd);
        sd.reverse();//reverse the sequence of words
        System.out.println(sd);














    }
}
