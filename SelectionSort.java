package DSA;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int arr[]){
        for(int i = 0; i<arr.length; i++){
            int min_index = i;{
                for(int j= i+1; j<arr.length; j++){
                    if(arr[j]<arr[min_index]){
                        min_index = j ;
                    }
                }

                if(min_index != i){
                    int temp = arr[min_index];
                    arr[min_index] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arra[] = {78,54,89,63,23, 12,46};
        selectionSort(arra);
        System.out.println("sorting array is ");
        System.out.println(Arrays.toString(arra));
    }
    
}
