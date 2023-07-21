import java.util.*;
public class Amidle {
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        double arr[]=new double[n];
         int i;
         double m=0;
         for(i=0;i<n;i++){
            arr[i]=sc.nextDouble();
         }
         if(n%2==1){
            m=arr[(n+1)/2-1];
         }
         else{
            m=(arr[n/2-1]+arr[n/2])/2;
         }
         System.out.println(m);
    }
    
}
