import java.util.*;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class Sst {
    public static void main(String []args){
    Scanner sc=new Scanner (System.in);
    String s1=sc.nextLine();
    String s2=sc.nextLine();
    if(s1.contains(s2)){
        System.out.println(s2 +"sub string of"+s1);
    }
    else if(s2.contains(s1)){
        System.out.println(s1 +"sub string of"+s2);
    }else 
    System.out.println("not match a string");
    }
    
}
