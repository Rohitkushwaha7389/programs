//swap array
import java.util.*;
public class spa {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int []a=new int[50];
    int i;
    for(i=0;i<n;i++)
    a[i]=sc.nextInt();
    int k=sc.nextInt();
    k=k%n;
    swap(k,n,a);
    for(i=0;i<n;i++)
    System.out.print(a[i]);

}   
public static void swap(int x,int y,int[] arr){
    int temp=arr[x];
    arr[x]=arr[y];
    arr[y]=temp;
} 
}