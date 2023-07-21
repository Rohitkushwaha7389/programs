import java.util.*;
public class fgame {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
       int n=sc.nextInt();
        int i=1,c=1;
        n=n-2;
        while(true)
        {
            if(i==n)
            break;
            else
            i+=2;
            c+=1;
            if(i==n)
            break;
            else
            i=i-1;
            c+=1;
        }
        System.out.print(c);
    }
        }