package DSA;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the total number of element of array :");
        int n = sc.nextInt();

        System.out.println("enter the elements of the array");
        int arr[] = new int[n] ;

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter target element");
        int x = sc.nextInt();

        int idx = -1;

        for(int i = 0; i<n; i++){
            if(arr[i] ==x){
                idx = i;
                break;
            }
        }

        if(idx == -1){
            System.out.println("element is not found");
        }else{
            System.out.println("element is present at the location : " + idx);
        }
    }
    
}
