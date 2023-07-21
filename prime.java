import java.util.*;
import java.util.Scanner;
public class prime {
    public static boolean prime (int n){
        boolean f=false;
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                f=true;break;}
             
            }
            return f;
        }

        public static void main(String[]args){
            int s=0;
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++){
            if(!prime(i)){
                s+=i;
            
            }
            System.out.println(s);
        }
            }
    }
