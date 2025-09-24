package arrays;
import java.util.*;
public class MovingZerostoEnd {
	public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        int index = 0; // Position to place the next non-zero element

        // Move all non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
		index++;
            }
        }

        // Fill the rest with zeros
        while (index < arr.length) {
            arr[index] = 0;
	     index++;
        }

        // Print the result
        System.out.println(Arrays.toString(arr));
    }


}
