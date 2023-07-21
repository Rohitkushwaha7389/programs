import java.util.*;
public class Pallindromn {
    public static void main(String []args ){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r,n1,s=0;
        n1=n;
        while(n!=0){
            r=n%10;
        s=s*10+r;
        n/=10;

        }
        System.out.println(s);
        if(s==n1)
        System.out.println("Pallindrome number");
        else 
        System.out.println("not Pallindrome");
    }
    
}
