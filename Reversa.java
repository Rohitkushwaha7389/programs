import java.util.Scanner;
public class Reversa {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        int l=arr.length;
        for(int i=arr.length-1;i>=0;i--){
           int temp =arr[i];
           arr[i]=arr[l-1];
           arr[l-1]=temp;
            System.out.println(arr[i]);
        }
    }
    
}
