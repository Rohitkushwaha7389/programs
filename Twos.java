import java.lang.*;
import java.util.*;
import java.util.Scanner;


public class Twos {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        if(s1.length()>s2.length()){
          //  System.out.println("found");
           if (s2.contains(s1)){
           System.out.println(s2+" is substring of" +s1);

        }
        else
        if(s1.contains(s2))
        System.out.println(s1+" is substring of "+s2);
    }else
    
    System.out.println("not found");
}
}
