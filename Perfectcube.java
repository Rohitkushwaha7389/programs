import java.util.*;
public class Perfectcube {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int i=0,c=0,f=0;
        int n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
         c=i*i*i;
         if(c==n){
         f=1;break;
        }
       else if(c>n){
          break;
        }
        }
        if(f==0)
         System.out.println("yes");
        else
         System.out.println("no");

        }
    }








            
    

    
    


