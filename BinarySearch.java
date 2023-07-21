import java.util.*;
import java.io.*;
public class BinarySearch {
    public static int binarySearch(int arr[],int target){
        int low=0, high=arr.length-1;
        while (low<=high) {
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
           else if(arr[mid]<target){
              low=mid+1;
           }
           else{
            high=mid-1;
           }
            
        }
        return 0;
    }

    public static void main(String[] args) {
        
     Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
            
        }
      
        int x=sc.nextInt();
    int result=binarySearch(arr,x);
       
            if(result==0){
                System.out.println("Searched element is nt found an array");
            }else{
                System.out.println("Searched element find at the location: "+result);
            
        }
    }
}