import java.util.*;
public class Armestrong {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,l=0,o=n;
        while(n>0){
            l=n%10;
            sum+=l*l*l;
            n=n/10;
        }
        if(sum==0){
        System.out.println("Armestrong number");
        }else{
            System.out.println("Not armestrong number");
        }
    }
    
}
