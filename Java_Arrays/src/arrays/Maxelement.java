package arrays;

public class Maxelement {

	
		public static void main(String[] args){
	        //finding length of an array
	        int arr[]={1,23,4,5,66,78};
	        int max=arr[0];
	        for(int i=1;i<arr.length;i++){
	            if(arr[i]>max){
	                max=arr[i];
	            }
	        }
	        System.out.println(max);
	  }
	}

