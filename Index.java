import java.util.*;
class Index{
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt(); int  i,sum=0;
        int arr[]=new int[n];
        for( i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0 ;i<arr.length;i++){
           sum=arr.length+arr[i];
           // Arrays.sort(arr);
           // for(int i=0;i<arr.length;i++){
              //  int a[]=new int[];
          //  for(int i=0;i<arr.length;i++){

            
            System.out.println(sum);
          //  System.out.println(arr[3]);
            }
    }
}

