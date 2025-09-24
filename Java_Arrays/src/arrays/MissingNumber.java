package arrays;

public class MissingNumber {
	public static void main(String[] args) {
        int nums[] = {1,2,3,5};
        int n = nums.length + 1;
        int total = (n * (n + 1)) / 2;
        int sum = 0;
        for(int x:nums){
            sum += x;
        }
        System.out.println(total - sum);
    }

	

}
