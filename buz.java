import java.util.*;
public class buz {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[50];
        int i,p=0;
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
            for(i=0;i<arr[i];i++){
            if(arr[i]%2==1){
                p=p+arr[i];


            }
            if(buz(p)==true)
            System.out.println("special nuber");
            else 
            System.out.println('not aspecial ');

            }

            
        }

    }
    
}
