import java.util.*;
import java.lang.*;
import java.util.Scanner;
//Read data of various type
public class Readd {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().toUpperCase();
        Char gender=sc.next().charAt(0);
        int n=sc.nextInt();
        long mb=sc.nextLong();
        Double de=sc.nextDouble();
        System.out.println(s);
        System.out.println(n);
        System.out.println(mb);
        System.out.println(de);
    }
    
}
