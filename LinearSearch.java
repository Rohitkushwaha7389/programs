import java.util.*;
import java.io.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
            
        }
        int x=sc.nextInt();
        int idx=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                idx=i;
                break;
            }
        }
            if(idx==-1){
                System.out.println("Searched element is nt found an array");
            }else{
                System.out.println("Searched element find at the location: "+idx);
            
        }
    }
}
