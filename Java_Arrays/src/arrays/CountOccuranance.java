package arrays;

public class CountOccuranance {
	public static void main(String[] args) {
        int c=0;
        int ele=2;
        int arr[]={2,3,4,1,2,4,2};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele){
                c+=1;
            }
        }
        System.out.print(c);
    }

	

}
