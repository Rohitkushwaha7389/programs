import java.util.*;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
public class Sss {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
       String s=sc.nextLine().toLowerCase();
       char[] ch=s.toCharArray();
         Arrays.sort(ch);
         String s1= new String(ch);
         System.out.println(s.substring(s1.length()-3));
    }

    
}
