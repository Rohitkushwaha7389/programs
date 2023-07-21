import java.util.*;
public class Prime4 {
    public static void main(String []args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int i;
        for(i=2;i<num;i++)
            if(num%i==0)
            break;
            if(num==i)
            System.out.println("prime number");
            else
            System.out.println("not prime");
            
        }
        
    }
    

