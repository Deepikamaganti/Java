package arrays;
//checking element is even or odd 
public class EvenOdd {
	public static void main(String[] args){
        //finding length of an array
        int sum=0;
        int arr[]={1,23,4,5,66,78};
        int n=arr.length;
        for(int i:arr){
            if(i%2==0){
                System.out.println("even");
            }
            else{
                System.out.println("odd");
            }
        }
      

  }


}
