package arrays;

public class LeaderElements {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int n = arr.length;

        System.out.println("Leader elements:");

        int maxRight = arr[n - 1];
        System.out.print(maxRight + " "); 

        
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxRight) {
                maxRight = arr[i];
                System.out.print(maxRight + " ");
            }
        }
    }
}
