import java.util.Scanner;
public class revers  {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int s=0,r;
    while(n!=0){
        r=n%10;
        s=s*10+r;
        n=n/10;
    }
    
      System.out.println(s);
}
}
