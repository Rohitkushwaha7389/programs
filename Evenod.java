import java.net.SocketPermission;
import java.util.*;
public class Evenod {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0,m=n,r=0;
        while(n>0){
            if(n%10%2!=0)
            s=s*10+n%10;
            n=n/10;
        }
        while(m>0){
            if(m%10%2==0)
            s=s*10+m%10;
            m=m/10;
        }  
        while(s>0){
             r=r*10+s%10;
            s=s/10;
        }
      System.out.println(r);


    }
    
}
