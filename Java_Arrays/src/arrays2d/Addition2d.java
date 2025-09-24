package arrays2d;
import java.util.*;
public class Addition2d {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int rows = 3,cols = 3;
	        int[][] A = new int[rows][cols];
	        int[][] B = new int[rows][cols];
	        System.out.println("Enter elements of Matrix A:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                A[i][j] = sc.nextInt();
	            }
	        }
	        // Input elements of matrix B
	        System.out.println("Enter elements of Matrix B:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                B[i][j] = sc.nextInt();
	            }
	        }
	        System.out.println("Addition matrix: ");
	        int add[][] = new int[rows][cols];
	        for(int i = 0;i < rows;i++){
	            for(int j = 0;j < cols;j++){
	                add[i][j] = A[i][j] + B[i][j];
	                System.out.print(add[i][j] + " ");
	            }
	            System.out.println(); 
	        }
	    }
}