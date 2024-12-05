public class Array{

    int logic( int num[]) {
        int z = 0;
        for( int n : num){
            z = z+n ;
        }

        return z;
    }


    public static void main(String[] args){
//         int nums[] = {2,3,4,5,6};
//         //  System.out.println(nums[0]);
//         // System.out.println(nums[1]);
//         // System.out.println(nums[2]);
//         // System.out.println(nums[3]);

//         for(i=0; i<4; i++){
//                System.out.println(nums[i]);
//         }


        // int a[]= new int[3];
        // int a[0] = 5;
        // int a[1] = 7;
        // int a[2] = 9;

        // String name[] = {"num" , "hum" , "jum"};

                  // 2D ARRAY

//        int a[][] = new int[2][2];
//        a[0][0] = 2;
//        a[0][1] = 2;
//        a[1][0] = 2;
//        a[1][1] = 2;
//        int a[][] = {
//                {2,2},
//                {2,2}
//        };
//
//        for(int i=0; i<2; i++){
//            for(int j=0; j<2; j++){
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }
//
          // jagged array

//        int a[][] = {
//                {2,2,2},
//                {2,2},
//                {3,3,3}
//        };

//        for(int i=0; i<2; i++){
//            for(int j; j<a[i].length; j++){
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }

        // Enhanced For loop

//        int num[] = {2,2,2,3};
//
//        for(int n : num){
//            System.out.print(n + " ");
//        }

//        int a[][] = {
//                {2,2,2},
//                {2,2,3},
//                {3,3,3}
//        };

//        for(int b[] : a){
//            for(int c : b){
//                System.out.print(c + " ");
//            }
//            System.out.println();
//        }

        // array property(length)

//        int a[] = {1,2,3,4};
//        System.out.print(a.length);

//        int a[][] = {
//                {2,2,2},
//                {2,2,3},
//                {3,3,3}
//        };
//   System.out.print(a[1].length);

        // STRING PROPERTY (LENGTH())
//        String name = "mayank";
//        System.out.println(name.length());

        // anonymus array

        int a = 5 ;
        int b = 4 ;
        int c ;
        // method invocation using object creation
        Array obj = new Array();
        int num[] = {1,2,3,4,5};
        int z  = obj.logic(num);
        System.out.println(z);







    }
}


