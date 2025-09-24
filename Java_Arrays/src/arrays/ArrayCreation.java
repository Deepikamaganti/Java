package arrays;
import java.util.*;
public class ArrayCreation{

	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the size");
	        int n=sc.nextInt();
	        
	        int[] arr=new int[n];
	        for(int i=0;i<n;i++){
	            System.out.println("Enter no the elements");
	            arr[i]=sc.nextInt();
	            
	        }
	        for(int i=0;i<n;i++){
	            System.out.println(arr[i]);
	            
	     }
	        
	    }
	} 



