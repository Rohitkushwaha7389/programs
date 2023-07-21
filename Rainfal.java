import java.util.*;

import javax.sql.rowset.spi.SyncResolver;
public class Rainfal {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int arr[]=new int[12];
        for(int i=0;i<12;i++)
            arr[i]=sc.nextInt();
            for(int i=0;i<12;i++){
             sum= sum+arr[i];

        }
        System.out.println("Total number of rainfal :" +sum);
        System.out.println("average rainfal: " +sum/12);
        int smallest =arr[0];
        int large =arr[0];
        int k=0,l=0;
        for( int i=0;i<12;i++){
            if(arr[i]<smallest){
                smallest =a[i];
            k=i;}
            if(arr[i]>large){
                large =a[i];
                l=i;}
            }
            
            System.out.println("lowest : ");
            System.out.println(k+1);
            System.out.println("highest :");
            System.out.println(l+1);
        }

    }

    
    

