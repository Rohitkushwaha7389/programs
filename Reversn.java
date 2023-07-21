import java.util.*;
public class Reversn {
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int r,s=0;
       // int r=sc.nextInt();
        //int s=sc.nextInt();
     while(n!=0){
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        System.out.println(s);
    }
    
}
