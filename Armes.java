import java.util.*;
public class Armes {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in );
        int n=sc.nextInt();
        int r,s=0,n1;
        n1=n;
        while(n!=0){
        r=n%10;
        s=s+r*r*r;
        n=n/10;

        }
        System.out.println(s);
        
if(s==n1)
System.out.println("Arme Strong number");
else 
 System.out.println("not Arme Strong number");
    }
    
    
}
