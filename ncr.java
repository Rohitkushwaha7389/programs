import java.lang.*;
import java.util.*;
public class ncr {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int a,b,p=0,c=0; int fact;
        a=fact(n);
        b=fact(r);
        p=a/(n-r);

        c=a/(b*(n-r));
        System.out.println("the permutation:"+p);
        System.out.println("combination :"+c);
    }
    public static int fact (int n){
        int f=1;while(n>0){
            f=n--;
        }
            return 0;
        

    }
    
}
