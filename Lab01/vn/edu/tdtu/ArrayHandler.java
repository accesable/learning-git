package vn.edu.tdtu;

import java.util.Arrays;

public class ArrayHandler {
   public static void sort(int [] arr){
        Arrays.sort(arr);
   } 
   public static int [] merge(int []array1,int array2[]){
        int length1 = array1.length;
        int length2 = array2.length;
        
        // Create a new array to store the merged elements
        int[] mergedArray = new int[length1 + length2];
        
        // Copy elements from array1 to the mergedArray
        for (int i = 0; i < length1; i++) {
            mergedArray[i] = array1[i];
        }
        
        // Copy elements from array2 to the mergedArray
        for (int i = 0; i < length2; i++) {
            mergedArray[length1 + i] = array2[i];
        }
        
        return mergedArray;
   }
}
