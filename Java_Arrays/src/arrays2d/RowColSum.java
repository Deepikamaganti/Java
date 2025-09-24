package arrays2d;
import java.util.*;
public class RowColSum{

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int rows = 3,cols = 3;
	        int[][] arr = new int[rows][cols];
	        System.out.println("Enter Matrix: ");
	        for(int i = 0;i < rows;i++){
	            for(int j = 0;j < cols;j++){
	                arr[i][j] = sc.nextInt();
	            }
	        }
	        for(int i = 0;i < rows;i++){
	            for(int j = 0;j < cols;j++){
	                System.out.print(arr[i][j] + " ");
	            }
	            System.out.println();
	        }
	        for(int i = 0;i < rows;i++){
	            int rowSum = 0;
	            for(int j = 0;j < cols;j++){
	                rowSum += arr[i][j];
	            }
	            System.out.println("RowSum");
	            System.out.println(rowSum);
	        }
	        for(int j = 0;j < cols;j++){
	            int colSum = 0;
	            for(int i = 0;i < rows;i++){
	                colSum += arr[i][j];
	            }
	            System.out.println("ColSum");
	            System.out.println(colSum);
	        }


	    }
	}
