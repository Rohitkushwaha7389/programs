
    import java.util.*;
    public class Revrs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr []=new int[n];
        int res[]=new int[n];
        int i,j=0;
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
            for(i=n;i>0;i--,j++)
           
            {
                res[j]=arr[i-1];
            

        System.out.print("");
        System.out.print(res[j]);
            }
        }
    }


    

