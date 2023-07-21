import java.util.*;
public class Asort {
    public static void main(String []args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int arr []=new int[n];
        int i;
        for( i=0;i<n;i++){
            arr[i]=sc.nextInt(); 
        }

        Arrays.sort(arr);

        
        System.out.println(Arrays.toString(arr));
        
    }
    
}
