import java.util.*;
import java.util.Scanner;
class Jump{
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int l=s.length();
    int n=s.length()-1;
    int count=0;
    for(int i=3;i>0;i--){
        count +=n/i;
        
        if(n%i==0){
            break;
         } else{
                n=l-(l%i);
                count +=1;
            }
        }
        System.out.println(count);
    }

}
