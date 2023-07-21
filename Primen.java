import java.util.*;
public class Primen {
    public static void main(String []args ){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        for( i=2;i<n;i++)
        if(n%i==0)
        break;
        if(i==n)
        System.out.println("Prime number");
        else 
        System.out.println("Not prime number");
    }
    
}
