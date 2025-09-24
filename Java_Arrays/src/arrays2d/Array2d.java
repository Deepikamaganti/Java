package arrays2d;
import java.util.*;
public class Array2d {

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
    }

}
