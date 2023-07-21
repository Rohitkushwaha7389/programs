import java.util.*;
import java.io.*;
public class SquareRoot {
    public static int findSquareRoot(int num){
        int low=0,high=num,result=-1;
        while (low<=high) {
            int mid=low+(high-low)/2;
            long val=mid*mid;
            if(val==num){
                return mid;
            }else if(val<num){
                result=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return result;
    }
 public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        
    int result=findSquareRoot(num);
       
            if(result==-1){
                System.out.println("Searched element is nt found an array");
            }else{
                System.out.println("Searched element find at the location: "+result);
            
        }
    }
}    
    