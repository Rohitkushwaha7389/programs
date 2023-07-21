import java.util.*;
public class sp {
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int n1=n;
    int s=0,p=1,r;
    
    while(n!=0)
    {
         r=n%10;
        s+=r;
        p*=r;
        n=n/10;

    }
    if(n1==(p+s))
    System.out.println("special");
    else
    System.out.println("not special");
  }  
}
