import java.util.*;
import java.io.*;
public class LowerBound {
    public static int findFirstOccurence(int arr[],int target){
        int low=0, high=arr.length-1;
        int result=-1;
        while (low<=high) {
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
               result=mid;
              high=mid-1;
            }
            else if(arr[mid]>target){
                high=high-1;
            }
            else{
                low=mid+1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
            
        }
      
        int target=sc.nextInt();
    int result=findFirstOccurence(arr,target);
       
            if(result==-1){
                System.out.println("Searched element is nt found an array");
            }else{
                System.out.println("Searched element find at the location: "+result);
            
        }
    }
}    
    