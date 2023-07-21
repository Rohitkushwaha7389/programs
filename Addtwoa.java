import java.util.*;
//add two array
class Addtwoa{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];
        int a[]=new int[n];
        int i,sum=0,sum1=0,sum2=0;
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
            a[i]=sc.nextInt();
        }
        for(i=0;i<arr.length;i++){
            
            sum=arr[i]+i;
        }
        for(i=0;i<a.length;i++){
            sum1=a[i]+i;
          }
          sum2=sum+sum1;
        System.out.println(sum2);
    }
}