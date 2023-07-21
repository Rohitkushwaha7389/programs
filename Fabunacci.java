import java.util.*;
public class Fabunacci {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0,i;
        for(i=0;i<n;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;

        }
    }
    
}
