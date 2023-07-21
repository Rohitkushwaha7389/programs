import java.util.*;
public class sorta {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
        int[] a=new int[n];
        int i,j; 
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
            for(i=0;i<n;i++)
            {
            for( j=i+1;j<n;j++)
         //   a[j]=sc.nextInt();
            int t=0;
            if(a[i]>a[j]){
                
                t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
            System.out.println(a[i]);

        }
        }
    }
}
