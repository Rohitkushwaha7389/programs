import java.lang.*;
import java.lang.*;
import java.util.Scanner;
import java.util.Arrays;
public class Ssort {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().toLowerCase();
        char[] ch=s.toCharArray();
          Arrays.sort(ch);
          String s1= new String(ch);
          System.out.println(s.substring(s1.length()-3));
    }
    
}
