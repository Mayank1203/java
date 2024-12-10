package DSA;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int arr[]){

        for(int i = 0; i<arr.length; i++){
            Boolean swapping = false;
            for(int j = 0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;

                swapping = true;
            }
        }
        if(!swapping){
            break;
        }
        }

    }
    public static void main(String[] args) {
        int arr[] = {78,56,23,89,54,12};
        bubbleSort(arr);
        System.out.println("sorted array is : ");
        System.out.println(Arrays.toString(arr));
    }
    
}
