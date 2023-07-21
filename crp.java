import java.util.*;
public class crp { 
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        if(prime(a) && prime(b)){
            int d;
            if(a>b)
            d=a-b;
            else
            d=b-a;
            if(perfect(d))
            System.out.println("special");
            else 
            System.out.println("not a special");
        }}
        public static boolean prime(int n){
            boolean c=false;
            for(int i=2;i<n/2;i++)
            if(n%i==0)
            {
                c=true;  break;}
                return c;
            }
            public static boolean perfect(int n){ int s=0;
                for(int i=1;i<=n/2;i++) 
                if(n%i==0)
                s+=i;
                if(s==n)
                return true;
                else
                return false;
            }
        }
    

