package arrays;

public class MinElement {
	public static void main(String[] args){
        //finding length of an array
        int arr[]={1,23,4,5,66,78};
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
  }


}
