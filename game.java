import java.util.*;

public class game {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        int l=0;
        int n=sc.nextInt();
        if(c>='A' & c<='Z')
    //int n=sc.nextInt();
        n=n%26;
        
        int m=c+n;
        if((char)m<='Z')
        System.out.println((char)m);
        else 
        //int l=0;
        l=m-'Z';
        System.out.println((char)('A'+l-1));
    }
    
}
