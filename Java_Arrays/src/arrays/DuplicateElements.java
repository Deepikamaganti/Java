package arrays;

import java.util.Arrays;

public class DuplicateElements{
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 3, 7, 1, 9,1};
        Arrays.sort(arr);//{1,1,1,3,3,5,7,9}
        System.out.println("Duplicate elements:");
        for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] == arr[i + 1]) {
                    if(i == 0 || arr[i] != arr[i - 1]){
                    System.out.println(arr[i]);  // Break inner loop to avoid multiple prints
                }
            }
        }
    }
}

