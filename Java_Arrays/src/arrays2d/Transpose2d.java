package arrays2d;
import java.util.*;
public class Transpose2d {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input size
        int rows = 3;
        int cols = 3;
        int[][] A = new int[rows][cols];
        
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        // Calculate transpose
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
            	System.out.print(A[j][i] + " ");
            }
            System.out.println();


}
}
}
