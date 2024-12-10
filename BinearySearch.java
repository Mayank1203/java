package DSA;

import java.util.Scanner;

public class BinearySearch {

    public static int bineary(int arr[] , int target){
        int low = 0 ;
        int high = arr.length - 1;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid]< target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;

    }

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

        // Function Calling in Binary Search
        int result = bineary(arr , x);

        if(result == -1){
            System.out.println("element is not found");
        }else{
            System.out.println("element is present at the location : " + result);
        }
    }
    


    }
    
